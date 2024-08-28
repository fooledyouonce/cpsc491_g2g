# G2G_Prototype
## Abstract
Urban areas face a significant public health challenge: the accessibility of public bathrooms, particularly for disabled individuals.  This issue has been highlighted in cities like New York, underscoring the need for innovative solutions.  In response, we propose "Got2Go," a mobile application aiming to address this crisis.  Got2Go offers an interactive map with GPS integration, enabling users to locate the nearest accessible restrooms quickly.  Users can refine searches based on specific accessibility requirements, such as wheelchair-accessible stalls and gender-neutral facilities.  The application encourages community engagement by allowing users to contribute restroom information and features an accessibility rating system to provide detailed information on each restroom's features.  Furthermore, Got2Go notifies users of disruptions or closures of nearby accessible restrooms.  By improving restroom accessibility, Got2Go seeks to enhance the quality of life for disabled individuals in urban environments and foster a more inclusive urban landscape.

### Organization of Report:
- Introduction and Related Work
- Problem Definition
- Goals and Objectives
- Major Outcomes
- Development Process
- Summary and Conclusion
- References
- Appendix

## Introduction
In bustling urban landscapes, where city life thrives and populations converge, a public health crisis has been quietly unfolding—the accessibility of public restrooms.  This routine facet of city living holds disproportionate significance for a vulnerable population: individuals with disabilities.  The intricacies of this issue have been illuminated by the experiences of those navigating the streets of New York City, where the quest for safe and clean public restrooms has become a formidable challenge.
In the face of this pressing concern, there has been a call for innovative solutions addressing public restroom access.  It is within this context that the developed mobile application, aptly named "Got2Go," emerges as a start towards resolving this issue.  Got2Go is much more innovative than a simple application; it is a vehicle for change, driven by a commitment to foster community engagement and uphold the values of inclusivity and accessibility.

Ultimately, it is a digital platform that promises to revolutionize the way urban dwellers experience restroom accessibility.  Through a dynamic and user-friendly interface, Got2Go offers an interactive map with GPS integration, enabling users to swiftly identify the nearest accessible restrooms.  What sets it apart is its customizable search functionality, allowing users to filter results based on specific accessibility criteria, from wheelchair-accessible stalls to gender-neutral facilities.  This allows users to efficiently locate restrooms catered to their specific needs rather than having to physically scour their city for one.
Got2Go is not merely a passive tool; it is a dynamic, community-driven endeavor.  The application actively encourages users to contribute valuable information about the restroom facilities they encounter on a day-to-day basis.  This collective effort ensures that Got2Go remains an ever-evolving and reliable resource, reflecting the most up-to-date and accurate data available.
For the disabled community, Got2Go introduces an innovative accessibility rating system, delivering comprehensive insights into the features of each restroom, from door widths and grab bars to general cleanliness and included amenities.  Moreover, the application incorporates a proactive notification system, keeping users informed of any disruptions or closures of nearby accessible restrooms due to maintenance or other unforeseen circumstances, offering peace of mind and convenience.

The primary mission of Got2Go is to enhance the quality of life for disabled individuals in urban environments, to bridge gaps in accessibility, and to champion inclusivity.  This application, through the power of technology, community engagement, and a shared vision, creates a more inclusive and accessible urban landscape, where the daily experiences of individuals with disabilities are not marred by the challenge of finding a restroom, but rather enriched by the newfound freedom and dignity that Got2Go offers.

### 1.1 Related Work
In this section, we provide an overview of existing research and data as well as related projects regarding the public restroom crisis that has largely prompted the creation of Got2Go.  Such will assist in establishing the current state of this widespread issue in order to highlight the importance of our mobile application.  

#### 1.1.1 Why Access to Public Restrooms is Important
First, it is crucial to establish the importance of public restroom access.  Toilet access goes beyond mere convenience and is a vital practical concern for many individuals on a daily basis.  For disabled people, access entails more than just wheelchair ramps; it includes features like handrails, hoists, changing benches, shelf space, and considerations for sensory needs [1].  Public toilets should be seen as safe and convenient amenities, and their accessibility is crucial for various groups, including disabled individuals, trans people, carers, and older individuals who may plan journeys based on toilet accessibility.  Unfortunately, the closure of public toilets due to cuts and privatization has limited access.  Free and accessible toilet provision in public spaces is essential for a socially inclusive society.  Moreover, toilet access is linked to broader issues of defining "able"-bodiedness, gender, and public space.  By rethinking and improving toilet access, society can challenge existing norms and promote a shared right to the city.  Recognizing diverse user requirements related to disability, gender, faith, and age, toilets serve as multifunctional spaces for activities such as getting dressed, breastfeeding, administering medicine, caregiving, washing, maintaining privacy, and socializing.

#### 1.1.2 New York City’s Public Health Crisis
Many research surveys have been conducted in larger cities such as New York to assess the accessibility of restrooms, most of which have observed a public health issue in the process.  Last year in New York City, residents were questioned through a survey by Crohn’s & Colitis Foundation on their success in being able to properly locate a restroom, the results showing that just over half had experienced (or know of a family member who experienced) difficulty in finding a restroom to use in the past week.  Another near quarter of respondents reported having ever had a urinary or bowel accident before, half of which had experienced such in the past year.  Seventy-five percent of those respondents reported that such accidents could have been avoided with better accessible restrooms [2].  From this, it can easily be deduced that the inaccessibility of restrooms, especially in larger cities, has proven to be much larger than a minor inconvenience, but rather a genuine public health issue that Got2Go strives to mitigate. 

According to the National Product Radio, New York City has a total of 1,400 public restrooms to accommodate their population of eight and a half million people.  Problems in locating restrooms, while being a prevalent issue for an extended period of time, became especially underlined during the pandemic due to the lockdowns [3].  Council Member Gale Brewer of New York City has drawn attention to the fact that during that time, the closure of subway restrooms resulted in a significant increase in public urination and defecation throughout various areas of the city.  In addition to the general need for accessible public restrooms, it’s essential to recognize the significant impact that restroom availability can have on individuals with medical conditions.  The anxiety and potential limitations on their daily lives due to the lack of readily available public restrooms can be profound.  Dr.  Rabia De Latour has emphasized that such circumstances may even contribute to conditions like agoraphobia, wherein individuals become fearful of venturing out in public without guaranteed access to suitable restroom facilities [4].  With the possibility of future outbreaks that cause global lockdowns, resources for accessing public restrooms can become even scarcer.  This is where Got2Go comes into play, whereas in times of lockdowns or other emergencies, when knowing the availability of restrooms becomes critical, Got2Go can serve as a valuable tool to help individuals locate the nearest open facilities.

#### 1.1.2 Niantic (Ingress & Pokemon GO)
Got2Go plans on obtaining a significant portion of its data through crowdsourcing.  While not indicative of guaranteed success, there have been numerous other projects that were created through crowdsourced data that changed the world as we know it.  The most popular example in recent years is Pokemon Go–an application powered by data from one of Niantic’s previous games, Ingress [5].  In Ingress, users were “agents” working for a certain faction to try and control “portals,” which were notable locations in users’ local areas.  These portals were partially funded by companies who wanted to advertise their business by making it a place the users would want to spend time in-game, but a significant portion of the portals and locations in the game were created by users submitting pictures and location data.  Once a sufficient network had been established through years of success in Ingress, Niantic took that crowdsourced data and converted it into what is currently known as Pokemon Go.  Every single PokeStop and Gym in Pokemon Go is a location in Ingress, most of which were established via user submission, which became popular enough to convert to a location in Pokemon Go.  Using the same style of crowdsourcing, Got2Go can obtain significantly more data than would otherwise be available to the development team.

### 1.2. Problem Definition
Despite the fundamental importance of public restroom accessibility in densely populated urban areas, disabled individuals continue to face substantial challenges in locating safe, clean, and accessible facilities.  The lack of easily accessible and up-to-date information regarding restroom availability and features exacerbates this issue, adversely impacting the well-being and daily experiences of disabled urban residents.  Inadequate access to public restrooms not only poses physical challenges, but also contributes to the societal isolation of disabled individuals.  Addressing this critical problem is essential to ensure inclusivity and improve the quality of life for disabled individuals in urban environments.

### 1.3 Goals and Objectives
#### Goal 1: Enhance Access to Restroom Facilities
- **Objective 1.1**: Develop an innovative and user-friendly mobile application (Got2Go) with a simple and accessible user experience.
  - **Objective 1.1.1**: Personalize the application experience with unique user profiles, allowing users to sign up/log in to use the application.
- **Objective 1.2**: Seamlessly integrate GPS technology to empower users in identifying the closest available public restrooms.
  - **Objective 1.2.1**: Define a structured plan for collecting data from each restroom, including the specific attributes to capture (location, cleanliness, accessibility, location quality, etc.).
  - **Objective 1.2.2**: Determine the methodology for assessing cleanliness, accessibility, and location quality, ensuring consistency across data collection efforts.
- **Objective 1.3**: Empower users with a refined search experience by incorporating advanced filtering options within the application, allowing them to customize their restroom search based on specific accessibility criteria. These criteria include features such as wheelchair-accessible stalls, changing tables, adult changing stations, sanitary product availability, and the inclusion of gender-neutral restroom options.

#### Goal 2: Improve Accessibility Information
- **Objective 2.1**: Introduce an accessibility rating system within the application, offering users insights into the quality of restrooms.
- **Objective 2.2**: Implement a notification system to inform users of disruptions or closures of nearby accessible restrooms due to maintenance or other reasons, allowing users to plan their visits effectively.

#### Goal 3: Foster Community Engagement
- **Objective 3.1**: Encourage user participation by implementing a contribution feature that allows users to share information about encountered restroom facilities.
- **Objective 3.2**: Enhance the reliability and relevance of restroom facility information by incorporating a user-driven review system, ensuring that the application maintains up-to-date and accurate data, fostering a vibrant community-driven ecosystem.  This comprehensive rating system includes details such as stall door width, the presence of grab bars, and the overall cleanliness of the facilities.

### 1.4 Major Outcomes 
#### 1.4.1 Got2Go Mobile Application with GPS-Enabled Restroom Mapping
The primary deliverable is the Got2Go mobile application, featuring a GPS-enabled restroom mapping system.  This application serves as a user-centric platform to locate and access information about nearby public restrooms.  The GPS functionality is seamlessly integrated to provide accurate and real-time location-based services, ensuring users can easily find and navigate to the nearest accessible restroom.

#### 1.4.2 User-Friendly Interface for Contributing and Accessing Restroom Information
The application boasts an intuitive and user-friendly interface, facilitating seamless interaction for both contributing and accessing restroom information.  Users find it easy to submit reviews, share insights, and contribute valuable data about restroom facilities in their vicinity.  Simultaneously, accessing this information is a straightforward and efficient process, enhancing the overall user experience.

#### 1.4.3 Accessibility Rating System Providing Comprehensive Details
A key feature of the application is the Accessibility Rating System, offering users detailed insights into restroom amenities.  This system covers a range of categories, including but not limited to handrails, wheelchair accessibility, lighting, and overall cleanliness.  Users are able to contribute specific ratings to these categories, fostering a community-driven database of information tailored to the needs of individuals with diverse accessibility requirements.

#### 1.4.4 Notification System for Disruptions or Closures of Nearby Restrooms
The application features a robust notification system designed to alert users about disruptions or closures of nearby restrooms.  This proactive approach ensures that users are informed in real-time about changes in restroom availability.  The system not only notify users of closures but also enable them to contribute information about such incidents, fostering a collaborative and responsive community.
Collectively, these project outcomes aim to address the critical need for accessible restroom information, enhance user experiences, and contribute to the overall well-being and convenience of the community.

## 2.  Got2Go’s Development
### 2.1 Software Development Process
Our approach to the development of the Got2Go mobile application involved leveraging modern technologies and community engagement to address the problem of bathroom accessibility for disabled and underserved individuals in urban environments.  Our strategies included creating a user-friendly interface with GPS capabilities, facilitating user contributions and reviews, implementing an accessibility rating system, and integrating a notification system to enhance user experience.

#### 2.1.1 Software Development Model
The development of the Got2Go mobile application adopts the Scrum methodology, a widely-used agile framework known for its flexibility and iterative approach.  Within the Scrum framework, specific roles are designated to ensure smooth progress: the Product Owner, responsible for prioritizing features and representing stakeholder interests; the Scrum Master, facilitating adherence to Scrum practices and resolving impediments; and the Development Team, collaborating cross-functionally to deliver incremental product increments within time-boxed sprints.  Sprint planning sessions kickstart each iteration, involving comprehensive discussions between the Product Owner and team to select backlog items, estimate effort, and define tasks.  This methodology fosters adaptability and responsiveness, which is necessary for addressing the complex challenges of the Got2Go application.

#### 2.1.2 Requirements
The objectives driving the development of the Got2Go mobile application stem from the critical need to enhance bathroom accessibility for disabled and underserved individuals in urban environments.  These objectives are translated into specific requirements that guide the design and development process.  The application must feature a user-friendly interface, ensuring intuitive navigation for users of diverse backgrounds and abilities.  GPS capabilities are essential for accurate location mapping of restroom facilities and providing real-time navigation assistance.  Moreover, the application should facilitate user contributions and reviews, allowing for the continuous update of restroom information.  An accessibility rating system is integral for users to evaluate restroom facilities based on accessibility features, while a notification system enhances user experience by providing timely alerts and updates.  These requirements serve as the foundation for the development efforts, ensuring that the Got2Go application effectively addresses the challenges of bathroom accessibility in urban environments.

#### 2.1.3 Design
The design of the Got2Go mobile application emphasizes simplicity, accessibility, and inclusivity, ensuring a positive user experience for individuals with diverse needs.  With a user-centric interface and intuitive navigation, the application caters to users of varying technological proficiency and accessibility requirements.  Personalization options allow users to tailor the experience to their preferences, while location-aware features provide seamless access to nearby restroom locations and navigation assistance.  Robust feedback mechanisms enable community engagement and continuous improvement, while seamless integration of core features enhances usability.  Responsive design ensures optimal usability across various devices, reflecting our commitment to providing an inclusive and effective solution for addressing bathroom accessibility challenges in urban environments.

#### 2.1.4 Architecture
The architecture of the Got2Go mobile application, as depicted in Fig 1, facilitates the smooth flow of data and interactions between its key components.  The User Interface (UI) serves as the primary platform for users to access restroom information and contribute reviews.  User contributions directly interact with both the UI and the Notification System, enabling efficient dissemination of user-generated content through timely alerts and updates.  The Application Logic layer orchestrates interactions between components and processes user requests.  At the same time, User Authentication ensures account security and streamlines the registration and login process through Single-Sign-On (SSO) integration.  The Notification System enhances user engagement by delivering real-time alerts and updates based on user preferences and location.  GPS capabilities, supported by our chosen API, enable accurate location mapping of restroom facilities and navigation assistance.  External service requests, such as to the Open Map API, are made as needed to obtain additional map-related data.  Powered by Firebase, the Database Management system stores and manages relevant data, including user profiles, restroom information, and reviews.  This architecture ensures scalability, reliability, and responsiveness, enabling the Got2Go application to effectively address the challenges of bathroom accessibility in urban environments while providing a seamless user experience.

#### 2.1.5 Development Environment
The Got2Go application was developed initially for Android mobile devices.  The development platform is Android Studio, using Kotlin–the current industry standard.  Both server hosting and database management are managed by Google Firebase.  The GPS integration feature for accurate restroom mapping uses the Mapbox API.  Our team considered other APIs, namely the MapQuest API [6], but went forward with Mapbox [7] after an analysis of the features offered by both APIs (Fig 1).  Team members learned and applied the following skills in order to complete the development of this application: understanding of the Agile process and Software Development Lifecycle, Android application development expertise (or application development in general), database development and management–specifically relational databases in SQL, user interface design, and proficiency in Kotlin.

#### 2.1.6 Resources and Tools
##### got2gonyc Google Map 
got2gonyc, a restroom finding application dedicated to improving accessibility and hygiene in New York City, played a crucial role in the development process of our Got2Go application.  With a shared mission of providing reliable resources for locating restroom facilities, the integration of got2gonyc's crowdsourced data and user-generated content proved invaluable in enriching the functionality and usability of our application.
R
*esearch and Inspiration* We recognized the significance of leveraging existing resources and databases.  got2gonyc's extensive database, comprising over 2,000 restroom locations across all five boroughs of New York City, served as a valuable asset in our development process.  The insights gained from exploring its features and functionalities informed our decisions on feature prioritization, user experience design, and overall development strategy.

*User-Centric Design* One of the notable strengths of got2gonyc is its user-centric design, which prioritizes user needs and preferences in providing restroom information.  We drew inspiration from its user-generated content, including pictures, videos, and ratings of restroom locations.  This emphasis on user-generated content informed our approach to user engagement and content creation within our own application, ensuring that we prioritize user feedback and contributions in providing valuable restroom information.

*Community Engagement* Community engagement and collaboration fostered by got2gonyc inspired us to adopt a similar approach within our application in maintaining an up-to-date inventory of restroom facilities.  As such, we have implemented features within our application to encourage user contributions, feedback, and collaboration, thereby enriching the overall user experience and ensuring the accuracy and relevance of our restroom database.

The exploration of got2gonyc served as a valuable source of inspiration and guidance throughout the development process of our Got2Go application.  By learning from the features, design principles, and community engagement strategies of got2gonyc, we have been able to create a user-centric and community-driven application that meets the diverse needs of our users.

##### Felt 
In the development of the Got2Go application, our team recognized the importance of having a comprehensive database of restroom locations to provide users with accurate and useful information.  We initially discovered Felt Maps, a platform known for its collection of tactile maps designed for accessibility purposes, as a potential resource for our project.  We were able to transform the spreadsheet into a visual map with coordinates by utilizing Felt’s resources:

*Database Prepopulation* Upon discovering the import feature on Felt Maps, we proceeded to create a spreadsheet containing restroom information from the California State University, Fullerton (CSUF) campus.  This spreadsheet included details such as restroom locations, accessibility features, stall counts, cleanliness ratings, and other pertinent attributes.

*Transformation Benefits* The utilization of Felt Maps as a tool for data transformation offered several advantages to our project.  By leveraging the platform's capabilities, we were able to convert the tabular restroom dataset into a spatially aware map format, streamlining the process of database prepopulation.  Felt Maps facilitated the process of geocoding the restroom locations, assigning latitude and longitude coordinates to each entry, and rendering them on a map interface.  One of the key advantages of using Felt Maps was the flexibility it offered in terms of data customization and management.  Within the Felt Maps platform, we were able to add or delete attributes, change the attribute order, name, and layout to suit the specific requirements of our project.  Additionally, in the spreadsheet settings, we had the ability to change the geometry type and data format, further enhancing our control over the data transformation process.

The integration of Felt Maps facilitated the efficient transformation of restroom data into a visually accessible map format for the Got2Go application, providing us with a robust framework for populating our database.  This streamlined approach not only saved time but also allowed for customization and enhanced data management capabilities.  Moving forward, we are committed to utilizing innovative tools to further improve the accessibility and usability of the Got2Go application.

##### Figma
During the planning phase of the Got2Go application, Figma served as an essential design tool to figure out how to achieve a user-friendly interface while ensuring ease-of-use with a pleasing layout.  In the early stages, the core features such as writing a review and searching for a restroom with an integrated map were designed with different layouts before actual implementation.  This assisted us in narrowing down the capabilities of the application as well as it helped in structuring what skills would be necessary for the frontend work.  Through this, we were able to utilize many of the resources available through Figma which included Iconify.

*Iconify* The Iconify plugin gave us an extensive library of different icons to utilize as reference for the application.  It facilitated the designing process as we did not need to individually search for reference icons that would be used.  Along with this, it allowed our designs to be more closely aligned with what the final product would look like.

*SVG Vectors* Figma also facilitated the transition from design to implementation as it allows for the seamless transfer of icons to SVGs, which are the most optimal for use in Android Studio.  This again allowed us to save time with frontend development since many of the icons available were transferred and imported with ease.

*Screenflow* Through designing the variety of screens for Got2Go on Figma, we were also able to configure the screenflow and navigation for the application.  This again greatly assisted the implementation process as we were able to visualize the navigation between different pages, which created an ideal road-map of what was to be created.

*Layout Reference* Figma was used often as a final reference for the layout of every screen used for Got2Go.  This allowed for the ease in designing the screens on Android Studio itself, as providing a visual blueprint for layout composition created seamless collaboration between the design phase and development phase.  

Altogether, Figma was an optimal tool that facilitated the transition from design to implementation as it acted as a close reference for layout creation and screen navigation.  Along with this, it was an essential tool for fetching icons we would be utilizing for the application, which saved much time for our team.  

##### Jira
In the development of the Got2Go application, Jira Software Management Tool played a crucial role in facilitating the agile development process, particularly through the organization and execution of sprints.  Here is how Jira, with a focus on sprints, contributed to the success of the project:

*Sprint Planning* Jira provided a structured environment for sprint planning.  The development teams could create and prioritize a backlog of user stories and tasks, breaking down project requirements into manageable chunks.  This helped ensure that each sprint had a clear set of objectives and deliverables.

*Task Management* Within each sprint, Jira allowed teams to assign tasks to team members, set deadlines, and track progress in real-time.  This transparency enabled better coordination and collaboration among team members, ensuring that everyone was working towards the sprint goals effectively.

*Visibility and Transparency* Jira's dashboards and reporting features provided stakeholders with a clear view of project progress.  They could monitor the status of tasks, track team velocity, and identify any potential bottlenecks or issues early on.  This level of visibility fostered communication between the development team and stakeholders.

*Adaptability* Jira's flexibility allowed teams to adapt to changing requirements or priorities during the development process.  If new features or changes arose, they could be quickly added to the backlog and prioritized for future sprints.  This agility ensured that the project remained responsive to user feedback and evolving needs.

*Continuous Improvement* By conducting sprint retrospectives within Jira, the team could reflect on their performance at the end of each sprint.  They could identify what went well, what could be improved, and take actionable steps to refine their processes in subsequent sprints.  This commitment to continuous improvement helped drive efficiency and quality throughout the project.

Overall, Jira Software Management Tool, with its focus on sprints, provided the framework and tools necessary for effective agile project management.  It facilitated collaboration, transparency, adaptability, and continuous improvement, ultimately contributing to the successful development and deployment of the Got2Go application.

##### MapBox
Mapbox provides a batteries included software development kit for embedding configurable map UIs into applications.  The SDK also allows applications to plug into the Mapbox API which offers a rich set of features including geolocation, search, and extensibility.  Our application utilizes the Mapbox SDK to display a customized map ui which takes in a data source from our own api and transforms it into a set of markers on the map for finding restrooms.  Additionally the Android version of the SDK we utilize has excellent editor integration (albeit some out of date documentation on certain features) with Android Studios, allowing us to develop comfortably with type hints and documentation inside the IDE.

##### Firebase 
In the realm of application development, Firebase stands out as a versatile platform, offering a suite of tools and services that streamline the process and enhance user experiences.  For the Got2Go application, Firebase plays a pivotal role, ensuring real-time data synchronization, secure authentication, and comprehensive analytics.  These are the advantages of using Firebase for Got2Go’s development:

*Integration with Android Studio* Firebase offered seamless integration with Android Studio, Google's official IDE for Android application development.  This integration streamlined the development process, allowing the team to incorporate Firebase services into their Android projects easily.

*Real Time Database* Firebase's Realtime Database provided real-time synchronization of data across devices.  This feature was particularly useful for the Got2Go application which requires live updates, as it ensured that changes made by one user are immediately reflected on other users' devices.  Also, by monitoring application performance metrics in real-time, the team could optimize the application for better user experience and performance on Android devices.

*Cloud Firestore* Firebase's Cloud Firestore offered a scalable and flexible NoSQL database solution.  It allowed the team to store and query data in a structured manner, making it suitable for the Got2Go application with complex data models.

*Authentication* The Got2Go application user authentication optimized Firebase Authentication, offering efficient email/password login and seamless integration with Google login.  The team benefited from simplified implementation, as Firebase Authentication supported these authentication methods, minimizing the need for extensive code.  This approach enhanced security while providing users with a seamless login experience, ultimately contributing to the Got2Go application's overall efficiency and user satisfaction.

In conclusion, Firebase greatly enhances Got2Go, providing seamless integration, real-time data sync, and secure authentication.  With Firebase, Got2Go delivers an efficient and satisfying user experience in restroom mapping and accessibility.

##### GitHub
Over the course of development for Got2Go, GitHub stood out as an invaluable platform, offering a suite of tools and services that streamlined collaboration and version control, ensuring the success of our software project.  For our Got2Go application, GitHub’s role of facilitating seamless collaboration, version control, and project management contributed to simplified application development.  Here's how GitHub contributed to the development of Got2Go:

*Version Control and Collaboration* GitHub's version control system enabled our development team to work collaboratively on the Got2Go codebase.  Through features like branching, pull requests, and merge conflict resolution, GitHub ensured that multiple team members could work on different features simultaneously without disrupting the main codebase.  This streamlined the development process and fostered effective collaboration among team members, ultimately speeding up the project timeline.

*Continuous Integration and Deployment (CI/CD)* As we continue to develop Got2Go, we seek to leverage GitHub Actions in order to implement automated CI/CD pipelines to streamline the testing and deployment process for Got2Go.  By automatically building, testing, and deploying code changes with each GitHub push or pull request, GitHub Actions can help us maintain code quality, catch bugs early, and deliver updates to users quickly and efficiently.  This not only improves the reliability of the Got2Go application but also reduces the manual effort required for deployment, allowing our team to focus on adding value to the product.

*Community Engagement and Feedback* GitHub's community features, such as discussions and pull request reviews, could enable our team to engage with users, contributors, and other stakeholders effectively.  By soliciting feedback, addressing issues, and incorporating community contributions, we would be able to iterate rapidly, improve the quality of the Got2Go application, and build a stronger, more engaged user community.

In conclusion, GitHub played a crucial role in the development of Got2Go, providing essential tools and services for version control, collaboration, project management, and community engagement.  By leveraging GitHub's capabilities, our team was able to work more efficiently, deliver updates more frequently, and ultimately build a better product for our users.

### 2.2 Implementation
#### 2.2.1 Application Development 
The development of the Got2Go mobile application followed an agile approach, utilizing a series of sprints to incrementally implement specific features.  Each iteration underwent thorough testing for robustness and user-friendliness.  The initial focus of the first deployment of the application was on catering to the unique needs of disabled individuals, ensuring that the application is inclusive and accessible from the outset.  This user-centric platform features a GPS-enabled restroom mapping system, seamlessly integrated to provide accurate and real-time location-based services.  The Got2Go mobile application serves as a solution for users to easily locate and access information about nearby public restrooms.  Through its GPS functionality, users can navigate to the nearest accessible restroom with ease, enhancing their overall experience.

### 2.2.2 Sprints
#### Sprint 1
The front end and back end were set up and communication was established by configuring APIs or other communication protocols.  With the connection established, layouts and UI elements were implemented based on design specifications, ensuring they were functional and ready for deployment.

#### Sprint 2
Mapbox API was integrated into the application, providing functionalities such as mapping and location-based services.  This involved setting up the API keys, configuring the necessary endpoints, and implementing the desired features, ensuring seamless integration with the application's front end.

#### Sprint 3
After integrating the necessary APIs and establishing communication between the front end and back end, core functionalities and user interfaces were implemented, iterating through multiple versions to refine features and address any issues.  This iterative process culminated in the successful creation of a working prototype, demonstrating the application's basic functionalities and UI elements, pending the ratings feature.

#### Sprint 4
The team focused on completing outstanding tickets and began implementing the basic functionality of the user rating system.  This involved addressing any remaining issues from previous development phases and laying the groundwork for users to provide ratings and feedback within the application.  As a result, significant progress was made towards achieving the overall project goals and delivering a functional prototype.

#### 2.2.3 User Engagement
The developed application boasts an intuitive and user-friendly interface, ensuring seamless interaction for both contributing to and accessing restroom information.  Users in the beta-testing phase found it easy to submit reviews, share insights, and contribute valuable data about restroom facilities in their vicinity.  Accessing this information became a straightforward and efficient process, significantly enhancing the overall user experience.

Recognizing the scarcity of information about public bathrooms and their amenities, the application heavily relies on user contributions and engagement.  During the initial beta-testing phase, users were strongly encouraged to share reviews about restrooms in their vicinity and provide information about additional restroom locations.  A collaborative approach was adopted, where a restroom receiving multiple contributions was integrated into the GPS system as an official restroom icon location.  This strategy ensured that the application dynamically evolved based on real-time user input, creating a comprehensive and up-to-date resource.

#### 2.2.4 Accessibility Rating System
A key feature of the developed application is the Accessibility Rating System, which offers users detailed insights into restroom amenities.  This system covers a range of categories, including handrails, wheelchair accessibility, lighting, and overall cleanliness.  Users can contribute specific ratings to these categories, fostering a community-driven database of information tailored to the needs of individuals with diverse accessibility requirements.

Implemented within the first phase of application development, the accessibility rating system provides detailed insights into restroom amenities, particularly catering to disabled individuals.  Users are prompted to submit reviews by contributing at least one rating to a general category, such as "Number of Stalls" or "Overall Cleanliness", or to specific amenities like "Handrails" or "Wheelchair Accessibility".  They have the option to provide text input and quantities for certain amenities, enhancing the depth of their reviews.  Initially, users are presented with general categories, with more specified amenities displayed upon request.  The accessibility rating system serves as a valuable tool for individuals in need of restrooms catering to specific accessibility needs.

The two ratings that are the most important to collect (at least for the first iteration of the application) are the cleanliness ratings and the accessibility ratings.  Furthermore, latitudinal and longitudinal data are required due to the fact that not every restroom may have an address (i.e.  beach bathrooms).  However, all restrooms would have latitudinal and longitudinal coordinates, which can be used with map interfaces and allow users to find a restroom near their geological location.

#### 2.2.5 Notification System
The fully developed application boasts a robust notification system, designed to promptly alert users about disruptions or closures of nearby restrooms.  This proactive approach ensures real-time updates on restroom availability, empowering users to stay informed.  Not only does the system notify users of closures, but it also allows them to contribute information about such incidents, fostering a collaborative and responsive community.

The Notification System prioritizes user convenience, delivering timely alerts when users are near accessible public restrooms.  Customizable notifications cater to user preferences, including options for private or wheelchair-accessible facilities.  User contributions are pivotal in maintaining up-to-date information; for example, users can report restroom closures, triggering notifications for nearby users.  Additionally, users can provide feedback and updates on bookmarked restrooms, enhancing the application's community-driven nature.  This feature underscores the collective effort to uphold a reliable and community-supported database of restroom information, ensuring notifications are contextually relevant and beneficial to users in their immediate surroundings.

### 2.3.  Testing and Further Refinement
#### 2.3.1 Testing
Following the deployment of the application, a comprehensive testing strategy has been employed to ensure both functionality and user-friendliness.  This includes rigorous functional testing to verify the proper operation of features, performance testing to assess scalability, and user-friendliness testing encompassing usability and accessibility assessments.  Furthermore, security testing is conducted to identify and mitigate potential vulnerabilities, safeguarding user data and ensuring a secure environment.  

Most importantly, user feedback is actively solicited through surveys and interviews, guiding iterative refinements to the application based on real user insights.  This iterative approach allows for continuous improvement, addressing reported bugs, enhancing the user interface, and incorporating new features.  Documentation is updated correspondingly, ensuring users are well-informed about the application's evolving capabilities.  By systematically implementing these measures, the developed application aims to not only meet functional requirements but also deliver a positive and evolving user experience, aligning closely with user needs and expectations.

#### 2.3.2 Further Refinement
Following the comprehensive testing and user feedback collected during the alpha and beta deployment stages of the application, several key areas for further refinement and future development have been identified:

##### Iterative Development
The team recognizes the importance of continuous improvement through iterative development.  This process involves addressing reported bugs, refining the user interface based on feedback, and incorporating new features.  By prioritizing user needs and expectations, Got2Go can evolve to better serve its users.

##### Enhanced Accessibility 
Ensuring inclusivity for users with diverse needs remains a top priority.  To achieve this, the team aims to further enhance the application's accessibility features.  This may involve refining the Accessibility Rating System, improving compatibility with screen readers, ensuring ADA compliance in the color palette, and addressing any other usability barriers identified through user testing.

##### Security Enhancements 
As an application that targets disabled and other underserved users, maintaining a secure environment is paramount.  The team is committed to conducting regular security testing and audits to identify and mitigate potential vulnerabilities.  By prioritizing the protection of user data, Got2Go can uphold the trust and confidence of its user base.

##### Integration of Advanced Features
Exploring opportunities to integrate advanced features and functionalities is essential for enriching the user experience.  This could include implementing augmented reality for enhanced navigation, leveraging machine learning algorithms for personalized recommendations, or integrating social media functionalities for increased community engagement.

##### Expanded Data Collection 
To provide users with more comprehensive insights, the team plans to expand the scope of data collection efforts.  This may involve incorporating additional information such as restroom cleanliness ratings, availability of essential amenities, and user-generated photos or comments.  By enriching the dataset, Got2Go can empower users to make more informed decisions when searching for nearby restrooms.

##### Continued User Engagement
Maintaining active communication channels for soliciting ongoing user feedback is crucial for driving future improvements.  Through surveys, interviews, and user forums, the team aims to engage with users regularly to understand their evolving needs and preferences.  By prioritizing user feedback, Got2Go can ensure that its development remains aligned with user expectations.

##### Documentation Updates
Regularly updating the documentation to reflect the evolving capabilities of the application is essential to the team in order to  provide users with up-to-date guidance.  By ensuring that users have access to clear and comprehensive documentation, Got2Go can empower them to make the most of its features and functionalities.

By focusing on these next steps and further refinements, Got2Go can continue to evolve and improve, delivering an even more seamless and impactful experience for users seeking access to nearby restroom facilities.  Through ongoing collaboration and dedication to user-centric development, Got2Go as both an application and a movement can drive positive change and enhance accessibility for all.

## 3.  Summary and Conclusion
### 3.1 Summary
The developed application, Got2Go, stands as a pinnacle of user-centric innovation, crafted to streamline access to vital information regarding nearby public restrooms.  Its core ethos revolves around simplicity, empowerment, and inclusivity, encapsulated within an intuitive interface and a suite of features.  Among these features, a GPS-enabled restroom mapping system serves as the backbone, guiding users to their nearest restroom facilities with pinpoint accuracy.  Complementing this navigational force is the Accessibility Rating System, a pioneering initiative aimed at catering to the unique needs of individuals with diverse accessibility requirements.

At the heart of Got2Go lies a vibrant and inclusive–albeit underserved–community, fueled by the collective contributions of its users.  Through the platform, users are empowered to share invaluable insights and firsthand experiences, ranging from detailed restroom reviews to nuanced accessibility ratings.  This collaborative endeavor not only enriches the application's database but also fosters a sense of camaraderie and shared responsibility among its users.

In the aftermath of the application's deployment, an exhaustive array of testing strategies has been–and will continue to be–implemented to ensure its functionality, user-friendliness, and, most importantly, security.  Rigorous testing protocols have been explored, including but not limited to, functionality tests, user acceptance testing (UAT), and security audits all which have potential to be instrumental in fortifying the application's robustness and reliability.

Our journey does not end with deployment; rather, it marks the commencement of an ongoing quest for excellence.  User feedback, solicited through various channels, serves as the compass guiding our iterative refinement process.  Each piece of feedback is analyzed, with insights gleaned serving as the cornerstone for future enhancements.  This relentless pursuit of improvement ensures that Got2Go remains not just a static application, but a living, breathing entity that evolves in tandem with the ever-changing needs and expectations of its user base.

### 3.2 Conclusion
In conclusion, the development and deployment of the Got2Go application signifies a monumental stride towards enhancing access to restroom facilities, particularly for individuals with diverse accessibility needs. By harnessing the power of technology and fostering community engagement, the application offers a pragmatic solution for users to effortlessly locate and access nearby restrooms with ease and efficiency.  Our unwavering dedication to prioritizing user feedback and embracing iterative refinement underscores our commitment to delivering a continuously improving user experience, one that remains responsive to the evolving needs and expectations of our diverse user base.

As we look ahead, our dedication to excellence remains steadfast.  We are poised to embark on a journey of ongoing refinement, with a primary focus on enhancing accessibility features, integrating cutting-edge functionalities, and broadening our data collection efforts.  By pursuing these avenues of improvement, we aspire to not only meet but exceed the expectations of our users, thereby making a tangible and enduring impact on the lives of those seeking access to restroom facilities.  Through our collective efforts, we are committed to fostering a more inclusive and accessible environment, where every individual can navigate the world with dignity and ease.  Together, we will continue to champion accessibility and empower individuals to navigate their daily lives with confidence and independence.

## References
[1] “10 Reasons Why Toilet Access Is Important,” Around the Toilet.  [Online].  Available: https://aroundthetoilet.wordpress.com/useful-materials/10-reasons-why-toilet-access-is-important/ 
[2] "New National Survey Shows Lack of Public Restrooms Widespread Public Health Issue," Crohn's & Colitis Foundation.  [Online].  Available: https://www.crohnscolitisfoundation.org/new-national-survey-shows-lack-of-public-restrooms-widespread-public-health-issue.
[3] J.  Garsd, "New York City's Public Restroom Problem Exposed by the Pandemic," NPR, Jul.  2022.  [Online].  Available: https://www.npr.org/2022/07/03/1108890230/public-restroom-in-new-york-city.  
[4] "Need a Bathroom? This New Yorker Is Here to Help," NY1, Jun.  2022.  [Online].  Available: https://ny1.com/nyc/all-boroughs/news/2022/06/17/need-a-bathroom--this-new-yorker-is-here-to-help.
[5] “Map The Planet! Gamifying Niantic Lightship ARDK’s Real-Time Mapping and Meshing,” AWE, Dec.  2021.  [Online].  Available: www.youtube.com/watch?v=fY2pGhLAg1Y.
[6] MapQuest.  [Online].  Available: https://developer.mapquest.com/documentation/ 
[7] Mapbox.  [Online].  Available: https://www.mapbox.com/ 

## Appendices
In the appendix section, the Installation Guide and Operation Manual for Got2Go are listed, providing comprehensive instructions for setting up and using the application.  Additionally, the appendix includes links to the project's main resources, allowing easy access to essential documentation and project repositories.  These resources aim to support users and developers alike in maximizing the utility and efficiency of Got2Go.

### Appendix I: Installation Guide

#### 1.  Download Got2Go from the Google Play Store:
- Open the Google Play Store application on your Android device.
- In the search bar, type "Got2Go" and press Enter.
- Locate the Got2Go application from the search results.
- Tap on the application icon to open its page.
- Press the "Install" button to begin the installation process.
- Wait for the application to download and install automatically.

#### 2.  Launch Got2Go:
- Once the installation is complete, tap on the Got2Go icon on your home screen or in the application drawer to launch the application.
- Ensure to either log in or create an account with Got2Go in order to both use its features and save your preferences. Users have an option of Single Sign-On (SSO) or creating a direct account with Got2Go.

#### 3.  Grant Permissions
- Upon launching Got2Go for the first time, you should be prompted to grant certain permissions, such as access to your location.  Location access permissions are necessary for the application to function properly, as it will allow for the integrated map to configure the current location.
- Follow the on-screen instructions to grant the required permissions.

### Appendix II: Operational Manual
Once the user has granted permissions, the map will display the nearest restroom locations within a given radius.   The user can update the radius or use the default.  When a user clicks on a bathroom location they can get information about each location, including review information from a popup that will appear next to the selected location.  There will also be buttons to add new locations and add reviews.  Those are handled by other screens, and the map state is updated before being redirected back to the map screen.

### Appendix III: Links
- **Jira**: https://cpsc491g2g.atlassian.net/jira/software/projects/G2G/boards/1
- **Confluence**: https://cpsc491g2g.atlassian.net/wiki/home 
- **GitHub**: https://github.com/cpscg2g/cpsc491_g2g 
