# FH_2023_TECS: Fully Green
## Recycling Recognition Application

### Target audience: 
- Anyone trying to reduce waste/contribute towards recycling

### Goal: 
- Educate people on and assist with recycling; Reduce waste and facilitate recycling

### Future implementations: 
- Maps API to search for nearby recycling facilities
- More classified data to improve model accuracy
- Crowdsourcing feature: allow users to submit data about recyclable materials
- Recycling tracker (gamified recycling, i.e. “You recycled 100 items this month!...”)

## Features:
- Recycling info page (i.e. built-in wiki with information regarding recyclable materials)
  - Fragment with image buttons and dialog fragments
- Image recognition for recyclable items
  - Uses built-in camera API; sends image data to an image-recognition AI to verify if the image contains a recyclable item or not
  - Spent time training AI using 22500-image dataset of organic/recyclable materials
- Manual recycling checker
  - User manually inputs information about the item and the data is queried in a database, returning relevant information upon success
  - Uses a text similarity model based on Euclidean distance
  - Trained on 83-count text-based materials classified by recyclable and nonrecyclabe
  
## Tools
- Android Studio
- Back4app (Parse)
- Jupyter Notebook

https://user-images.githubusercontent.com/64298603/230804423-902c9728-678e-4536-8c03-b78e5e9ebe17.mp4






