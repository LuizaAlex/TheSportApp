# TheSportsApp
 SportApp is an Android application designed to demonstrate the use of RecyclerView and CardView to display a list of sports with images and names. This application showcases how to create and manage a list of items using a custom adapter and RecyclerView.

## Features

- **RecyclerView**: Efficiently displays a scrollable list of sports items.
- **CardView**: Each item is presented within a card for a clean and stylish look.
- **Click Handling**: Displays a Toast message with the name of the selected sport upon clicking an item.

## Screenshots


  ![Screenshot 2024-08-01 at 17 49 44](https://github.com/user-attachments/assets/a8f19714-db39-415f-8aca-e5e567260252)


- ## Code Structure

- `MainActivity.java`: Initializes the RecyclerView, sets up the adapter with a list of sports, and handles item click events.
- `CustomAdapter.java`: Adapter for RecyclerView, binds sport data to the CardView items, and handles click events.
- `Sport.java`: Model class representing a sport with an image and a name.
- `res/layout/activity_main.xml`: Layout file for the main activity.
- `res/layout/card_item_layout.xml`: Layout file for each card item displayed in the RecyclerView.
- `res/drawable/`: Contains images used in the application.



### Prerequisites

To build and run this project, ensure you have:
- Android Studio (latest version recommended)
- Android SDK

