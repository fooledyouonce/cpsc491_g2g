package com.example.got2go.activities;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;

import com.example.got2go.R;
import com.example.got2go.fragments.HomeFragment;
import com.example.got2go.fragments.ProfileFragment;
import com.example.got2go.fragments.WikiFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.ParseUser;

import java.io.File;

public class Dummy3Activity extends AppCompatActivity {
    //TODO: update fragment w/g2g stuff
    private static final String TAG = "ScanActivity";
    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 396;
    private BottomNavigationView bottomNavigationView;
    ImageButton btnCapture;
    ImageButton btnSubmit;
    ImageView ivItem;
    TextView tvPrompt;
    private File photoFile;
    public String photoFileName = "item.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        bottomNavigationView = findViewById(R.id.bottomNavigation);
        btnCapture = findViewById(R.id.btnCapture);
        btnSubmit = findViewById(R.id.btnSubmit);
        ivItem = findViewById(R.id.ivItem);
        tvPrompt = findViewById(R.id.tvPrompt);

        tvPrompt.setText("Take a picture of the material you wish to recycle.");

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flContainer, new HomeFragment()).commit();
                        finish();
                        return true;
                    case R.id.action_wiki:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flContainer, new WikiFragment()).commit();
                        finish();
                        return true;
                    case R.id.action_profile:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flContainer, new ProfileFragment(ParseUser.getCurrentUser())).commit();
                        finish();
                        return true;
                    default:
                        return false;
                }
            }
        });
        btnCapture.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                launchCamera();
                tvPrompt.setText("Ensure the picture is clear with good lighting before submitting!");
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ivItem.getDrawable() == null) {
                    Toast.makeText(Dummy3Activity.this, "Please take a picture!", LENGTH_SHORT).show();
                } else {
                    //TODO: DB checking
                    Toast.makeText(Dummy3Activity.this, "Checking!", LENGTH_SHORT).show();

                    //TODO: Upon success, go to result
                    goResultActivity();
                }
            }
        });
    }

    private void goResultActivity() {
        Intent i = new Intent(this, Dummy2Activity.class);
        //i.putExtra("material", Parcels.wrap(material));
        startActivity(i);
        finish();
    }
    private void launchCamera() {
        //create Intent to take a picture and return control to the calling application
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //create a File reference for future access
        photoFile = getPhotoFileUri(photoFileName);

        //wrap File object into a content provider
        //required for API >= 24
        //see https://guides.codepath.com/android/Sharing-Content-with-Intents#sharing-files-with-api-24-or-higher
        Uri fileProvider = FileProvider.getUriForFile(this, "com.codepath.fileprovider", photoFile);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileProvider);

        //if you call startActivityForResult() using an intent that no app can handle, your app will crash.
        //so as long as the result is not null, it's safe to use the intent.
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            //start the image capture intent to take photo
            //noinspection deprecation
            startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
        }
    }
    @SuppressWarnings("deprecation")
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                //by this point we have the camera photo on disk
                Bitmap takenImage = BitmapFactory.decodeFile(photoFile.getAbsolutePath());
                //RESIZE BITMAP, see section below
                //load the taken image into a preview
                ivItem.setImageBitmap(takenImage);
            } else { // Result was a failure
                Toast.makeText(this, "Error taking picture!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private File getPhotoFileUri(String photoFileName) {
        //get safe storage directory for photos
        //use `getExternalFilesDir` on Context to access package-specific directories.
        //this way, we don't need to request external read/write runtime permissions.
        File mediaStorageDir = new File(this.getExternalFilesDir(Environment.DIRECTORY_PICTURES), TAG);

        //create the storage directory if it does not exist
        if (!mediaStorageDir.exists() && !mediaStorageDir.mkdirs()) { Log.d(TAG, "Failed to create directory"); }
        //return the file target for the photo based on filename
        return new File(mediaStorageDir.getPath() + File.separator + photoFileName);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Logout) {
            ParseUser.logOut();
            ParseUser currentUser = ParseUser.getCurrentUser();
            goLoginActivity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void goLoginActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}
