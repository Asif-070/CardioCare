
# CardioCare - An Android Application for Healthcare Management with ML solution


# Overview
CardioCare is an advanced Android application designed to improve healthcare accessibility and management. The app bridges the gap between patients and doctors by offering telemedicine services, appointment scheduling, and AI-driven heart disease predictions.

Developed as part of the **System Development Project** under the supervision of **Md. Motaleb Hossen Manik**, this project incorporates modern technologies and design principles to deliver an efficient and user-friendly healthcare solution.

## Features
### Patient Features
- **Login & Signup:** Secure authentication using Firebase.
- **Find Doctors:** Search and filter doctors by specialty, fees, or name.
- **Heart Disease Predictor:** Predict heart disease risks using an integrated machine-learning model.
- **Emergency Services:** Access ambulance services and emergency hotlines.
- **Profile Management:** Edit profiles, calculate BMI, and review prescriptions.

### Doctor Features
- **Patient Monitoring:** View patient records and history.
- **Prescription Management:** Add or edit prescriptions for patients.
- **Medical Resources:** Access disease and medication details.
- **AI chatbot:** Used OenAI API for instant QA.

### Admin Features
- **System Management:** Add/edit doctors, view patients, and manage ambulance services.
- **Data Oversight:** Monitor patient and doctor activities.
- Admin part of the application is in [CardioAdmin](https://github.com/Asif-070/CardioAdmin)

## Screenshots

**Main Menu:**

<table align="center" cellspacing="10" style="border: 5px solid black; border-collapse: collapse;">
  <tr>
    <td><img width="200" height="450" alt="0" src="https://github.com/user-attachments/assets/c073c49d-a850-4739-9903-bc70b3f0d515" /></td>
    <td><img width="200" height="450" alt="1" src="https://github.com/user-attachments/assets/e1d33248-f002-4a69-9859-f1c42c8e81e7" /></td>
    <td><img width="200" height="450" alt="2" src="https://github.com/user-attachments/assets/a9a5717e-fe05-438a-bd15-a881dc647a17" /></td>
  </tr>
</table>

**Patient Side:**

<table align="center" cellspacing="10" style="border: 5px solid black; border-collapse: collapse;">
  <tr>
    <td><img width="200" height="450" alt="4" src="https://github.com/user-attachments/assets/9f7328e9-4db1-4295-8a8b-b74058a44416" /></td>
    <td><img width="200" height="450" alt="5" src="https://github.com/user-attachments/assets/677644bd-a93e-4e86-ac84-84faea65c4c5" /></td>
    <td><img width="200" height="450" alt="6" src="https://github.com/user-attachments/assets/721ca702-381c-4651-ba0e-f3b66fdf28f9" /></td>
    <td><img width="200" height="450" alt="9" src="https://github.com/user-attachments/assets/1bd66c0d-372c-4953-a6f0-f2a57f207a1a" /></td>
  </tr>
  <tr>
    <td><img width="200" height="450" alt="10" src="https://github.com/user-attachments/assets/dac80bb5-8bd4-4250-b6ff-359864c7ef34" /></td>
    <td><img width="200" height="450" alt="11" src="https://github.com/user-attachments/assets/d50f5bb5-1ff7-4201-99e0-b67bfe89412a" /></td>
    <td><img width="200" height="450" alt="7" src="https://github.com/user-attachments/assets/605d996b-7d46-48f1-b156-f93fdeab164b" /></td>
    <td><img width="200" height="450" alt="8" src="https://github.com/user-attachments/assets/46ff0884-2173-4377-bbc4-dd6dfebb3a6c" /></td>
  </tr>
  <tr>
    <td><img width="200" height="450" alt="13" src="https://github.com/user-attachments/assets/ce8bf0e3-7fe8-4580-bb92-9e1d54e07f38" /></td>
    <td><img width="200" height="450" alt="12" src="https://github.com/user-attachments/assets/ae92eada-b5b9-4dad-a8b0-e2d279494812" /></td>
    <td><img width="200" height="450" alt="14" src="https://github.com/user-attachments/assets/77cd84e3-1c1f-4380-bf7c-a8a8e2197a98" /></td>
  </tr>
</table>
  
**Doctor Side:**

<table align="center" cellspacing="10" style="border: 5px solid black; border-collapse: collapse;">
  <tr>
    <td><img width="200" height="450" alt="16" src="https://github.com/user-attachments/assets/576b8477-ec0d-4929-b74b-a5603921e492" /></td>
    <td><img width="200" height="450" alt="17" src="https://github.com/user-attachments/assets/1cac6821-a646-4d1f-8c05-8008c2152104" /></td>
    <td><img width="200" height="450" alt="18" src="https://github.com/user-attachments/assets/1467ba62-9275-4cdf-97ff-2578aa60e5f6" /></td>
    <td><img width="200" height="450" alt="19" src="https://github.com/user-attachments/assets/fd4d59a3-0fcc-4fc0-b9a4-339e8e33fa64" /></td>
  </tr>
</table>

**Admin Side:**

<table align="center" cellspacing="10" style="border: 5px solid black; border-collapse: collapse;">
  <tr>
    <td><img width="738" height="1600" alt="ss20" src="https://github.com/user-attachments/assets/bbf6c761-7cb6-44a9-b69b-528e155d7941" /></td>
    <td><img width="738" height="1600" alt="ss23" src="https://github.com/user-attachments/assets/3c28c3fc-3067-4540-924c-86595324b5d5" /></td>
    <td><img width="738" height="1600" alt="ss24" src="https://github.com/user-attachments/assets/b81beb9c-48b3-45a3-892e-d10f9b8fd803" /></td>
  </tr>
</table>

## Tech Used
- Android Studio
- Firebase
- Google Colab
- TensorFlow Lite

## Data Flow Diagram

<img src="system_DFD.svg" alt="DFD" height = "550" width="600">

## Machine Learning Model 

This is an advanced machine learning-based diagnostic solution built on integrated datasets and enriched with deep learning, ensemble methods, and modern explainability techniques like SHAP and LIME.

## 🚀 Features

- ✅ **Preprocessing**: Handles missing values, outlier detection, and normalization.
- 🔄 **Dataset Integration**: Combines 5 benchmark datasets (Cleveland, Hungarian, Switzerland, VA, Statlog).
- 🔍 **Class Balancing**: Uses SMOTE for handling class imbalance.
- 📊 **Feature Engineering**: Feature importance using permutation, SHAP, and LIME.
- 🧠 **Models**:
  - XGBoost, LightGBM, CatBoost
  - Deep Neural Networks (Autoencoder architecture)
  - Ensemble & Stacking Classifiers
- 📈 **Model Evaluation**: Accuracy, Precision, Recall, F1-Score, ROC-AUC
- 🎯 **Explainability**: Visual interpretations using SHAP and LIME
- 📉 **Learning Curves & Correlation Heatmaps**

## 🗂️ Dataset

- **Sources**:
  - `processed.cleveland.data`
  - `processed.hungarian.data`
  - `processed.switzerland.data`
  - `processed.va.data`
  - `statlog_space_separated.data`

- **Features**: `age`, `sex`, `cp`, `trestbps`, `chol`, `fbs`, `restecg`, `thalach`, `exang`, `oldpeak`, `slope`, `ca`, `thal`, `num`

- **Target**: `num` (0 = No Heart Disease, 1 = Heart Disease)

## 🛠️ Technologies Used

- Python, Pandas, NumPy, Matplotlib, Seaborn, Altair
- Sklearn, XGBoost, LightGBM, CatBoost
- TensorFlow / Keras (Neural Network)
- Imblearn (SMOTE)
- SHAP, LIME, Permutation Importance
