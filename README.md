# **GUNI Utility App – README**

This Android application is built using **XML layouts (not Jetpack Compose)** and provides three useful interactive features related to **Ganpat University (GUNI)**. The interface includes a logo, a text label, and three buttons that perform different actions.

---

## **📌 Application Features**

### **1️⃣ GUNI MAP Button**

When the user taps the **GUNI MAP** button, the app opens **Google Maps** and navigates directly to *Ganpat University (GUNI)*.
This feature uses Android’s implicit intent mechanism to open a map application installed on the user’s device.

---

### **2️⃣ ANIMATION Button**

The **ANIMATION** button performs a visual animation on the **GUNI logo** displayed on the screen.
The animation is defined using **XML animation resources** placed in the `/res/anim` folder.
Possible animations include:

* Rotation
* Scaling
* Fading
* Sliding

The selected animation plays when the user clicks the button.

---

### **3️⃣ TEXT Button**

The **TEXT** button changes the main text on the screen.
Initially, the text displays **"HELLO"**.
After tapping the button, it updates to **"HOW ARE YOU?"**.

This provides a simple demonstration of dynamic text updates in Android using XML layouts and Java/Kotlin logic.

---

## **📱 Screenshots**

| ### **Home Screen** | ### **Text Updated** | ### **GUNI Map Opened** |
| <img width="720" height="1280" alt="image" src="https://github.com/user-attachments/assets/54807edf-e690-4401-bda5-055ee2e248aa" /> | <img width="720" height="1280" alt="image" src="https://github.com/user-attachments/assets/01c16c01-df26-4dd6-ba0e-8c74d4b99b9d" /> | <img width="720" height="1280" alt="image" src="https://github.com/user-attachments/assets/f6ddd8e4-11ea-4b7a-a2b2-7ad0e37e36be" /> |



### **Text Updated**

<img width="720" height="1280" alt="image" src="https://github.com/user-attachments/assets/01c16c01-df26-4dd6-ba0e-8c74d4b99b9d" />

### **GUNI Map Opened**

<img width="720" height="1280" alt="image" src="https://github.com/user-attachments/assets/f6ddd8e4-11ea-4b7a-a2b2-7ad0e37e36be" />


---

## **📂 Project Structure (XML Based)**

```
/app
 ├── java/
 │     └── MainActivity
 ├── res/
 │     ├── layout/          → XML UI files
 │     ├── anim/            → Animation XML files
 │     ├── drawable/        → Logo and background images
 │     └── values/          → Strings, colors, styles
 └── AndroidManifest.xml
```

---

## **🛠️ Technologies Used**

* Android Studio
* XML Layouts
* Java/Kotlin Activity Classes
* XML Animations (`/res/anim`)
* Google Maps Intent

---

## **📌 How It Works**

* The UI is created entirely with **XML layouts**.
* Buttons and text views are linked to the activity using standard Android view bindings.
* Animations are loaded from XML files in the `anim` folder.
* Map navigation is performed through Android’s Intent system.

