# CERDASKU Project Structure Documentation

## Overview

This document outlines the complete directory structure and organization of the CERDASKU project.

## Directory Tree

```
CERDASKU/
│
├── android/                          # Android Mobile Application
│   ├── app/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/com/cerdasku/
│   │   │   │   │   ├── activities/
│   │   │   │   │   ├── fragments/
│   │   │   │   │   ├── services/
│   │   │   │   │   ├── adapters/
│   │   │   │   │   ├── models/
│   │   │   │   │   ├── viewmodels/
│   │   │   │   │   ├── repositories/
│   │   │   │   │   ├── database/
│   │   │   │   │   ├── utils/
│   │   │   │   │   └── di/
│   │   │   │   ├── res/
│   │   │   │   │   ├── layout/
│   │   │   │   │   ├── drawable/
│   │   │   │   │   ├── values/
│   │   │   │   │   └── menu/
│   │   │   │   └── AndroidManifest.xml
│   │   │   └── test/
│   │   └── build.gradle
│   ├── build.gradle
│   ├── settings.gradle
│   ├── gradle.properties
│   └── README.md
│
├── web/                              # Web Application (React/Next.js)
│   ├── public/
│   │   ├── images/
│   │   ├── icons/
│   │   └── favicon.ico
│   ├── src/
│   │   ├── components/
│   │   │   ├── common/
│   │   │   ├── layout/
│   │   │   ├── modules/
│   │   │   │   ├── reading/
│   │   │   │   ├── writing/
│   │   │   │   └── math/
│   │   │   ├── dashboard/
│   │   │   ├── gamification/
│   │   │   └── auth/
│   │   ├── pages/
│   │   │   ├── student/
│   │   │   ├── teacher/
│   │   │   ├── parent/
│   │   │   ├── admin/
│   │   │   └── auth/
│   │   ├── services/
│   │   │   ├── api.js
│   │   │   ├── firebase.js
│   │   │   └── auth.js
│   │   ├── hooks/
│   │   ├── context/
│   │   ├── utils/
│   │   ├── styles/
│   │   ├── App.js
│   │   └── index.js
│   ├── package.json
│   ├── next.config.js
│   ├── .env.example
│   └── README.md
│
├── backend/                          # Node.js Backend Services
│   ├── src/
│   │   ├── config/
│   │   │   ├── firebase.js
│   │   │   ├── database.js
│   │   │   └── env.js
│   │   ├── routes/
│   │   │   ├── auth.js
│   │   │   ├── students.js
│   │   │   ├── teachers.js
│   │   │   ├── parents.js
│   │   │   ├── lessons.js
│   │   │   ├── progress.js
│   │   │   ├── leaderboard.js
│   │   │   └── admin.js
│   │   ├── controllers/
│   │   │   ├── authController.js
│   │   │   ├── studentController.js
│   │   │   ├── lessonController.js
│   │   │   ├── progressController.js
│   │   │   ├── reportController.js
│   │   │   └── leaderboardController.js
│   │   ├── models/
│   │   │   ├── User.js
│   │   │   ├── Student.js
│   │   │   ├── Lesson.js
│   │   │   ├── Progress.js
│   │   │   └── Achievement.js
│   │   ├── middleware/
│   │   │   ├── auth.js
│   │   │   ├── errorHandler.js
│   │   │   └── validator.js
│   │   ├── services/
│   │   │   ├── aiService.js
│   │   │   ├── reportService.js
│   │   │   ├── notificationService.js
│   │   │   └── gamificationService.js
│   │   ├── utils/
│   │   ├── app.js
│   │   └── server.js
│   ├── tests/
│   ├── package.json
│   ├── .env.example
│   └── README.md
│
├── ai-engine/                        # AI/ML Services
│   ├── models/
│   │   ├── handwriting_recognition/
│   │   ├── reading_analysis/
│   │   ├── text_generation/
│   │   └── speech_recognition/
│   ├── services/
│   │   ├── handwriting_service.py
│   │   ├── reading_service.py
│   │   ├── math_service.py
│   │   └── nlp_service.py
│   ├── api/
│   │   ├── app.py
│   │   ├── routes.py
│   │   └── utils.py
│   ├── training/
│   │   ├── train_models.py
│   │   └── data/
│   ├── requirements.txt
│   ├── Dockerfile
│   └── README.md
│
├── firebase/                         # Firebase Configuration
│   ├── config/
│   │   ├── firebaseConfig.js
│   │   ├── firebaseAdmin.js
│   │   └── credentials.example.json
│   ├── functions/
│   │   ├── index.js
│   │   ├── handlers/
│   │   │   ├── auth.js
│   │   │   ├── userManagement.js
│   │   │   ├── notifications.js
│   │   │   ├── leaderboard.js
│   │   │   └── reports.js
│   │   ├── package.json
│   │   └── .env.example
│   ├── firestore.rules
│   ├── realtime.rules
│   ├── storage.rules
│   ├── schema/
│   │   └── database_schema.md
│   └── README.md
│
├── design/                           # Design Assets
│   ├── brand/
│   │   ├── logo.png
│   │   ├── mascot/
│   │   ├── color_palette.md
│   │   └── typography.md
│   ├── ui-kit/
│   │   ├── components/
│   │   ├── patterns/
│   │   └── icons/
│   ├── screens/
│   │   ├── student/
│   │   ├── teacher/
│   │   ├── parent/
│   │   └── admin/
│   ├── figma-links.md
│   └── README.md
│
├── docs/                             # Documentation
│   ├── ARCHITECTURE.md
│   ├── API_DOCUMENTATION.md
│   ├── DATABASE_SCHEMA.md
│   ├── UI_UX_GUIDELINES.md
│   ├── AI_MODELS.md
│   ├── DEPLOYMENT.md
│   ├── TESTING.md
│   ├── SECURITY.md
│   └── CONTRIBUTING.md
│
├── .github/
│   ├── workflows/
│   │   ├── ci-android.yml
│   │   ├── ci-web.yml
│   │   ├── ci-backend.yml
│   │   └── deploy.yml
│   └── ISSUE_TEMPLATE/
│
├── scripts/
│   ├── setup.sh
│   ├── deploy.sh
│   └── migrate.sh
│
├── .gitignore
├── LICENSE
├── CONTRIBUTING.md
└── PROJECT_STRUCTURE.md
```

## Component Descriptions

### 1. Android (`/android`)
Native Android application built with Kotlin/Java using MVVM architecture.
- Clean Architecture principles
- Firebase Integration
- Offline-first with Room Database
- Material Design 3

### 2. Web (`/web`)
Responsive web application built with React/Next.js.
- Student Dashboard
- Teacher Management Panel
- Parent Monitoring Dashboard
- Admin Console

### 3. Backend (`/backend`)
Node.js Express server handling:
- Authentication & Authorization
- API endpoints for all modules
- Real-time notifications
- Report generation
- Leaderboard calculations

### 4. AI Engine (`/ai-engine`)
Python-based AI services:
- Handwriting Recognition
- Reading Analysis
- Math Problem Solving
- Natural Language Processing

### 5. Firebase (`/firebase`)
- Cloud Functions
- Security Rules
- Database Schema
- Authentication Setup

### 6. Design (`/design`)
- Brand Guidelines
- UI Component Library
- Screen Prototypes
- Design System

### 7. Documentation (`/docs`)
- Architecture Decisions
- API Reference
- Database Schema
- Deployment Guides
- Security Guidelines

## Development Workflow

1. **Feature Branch:** `git checkout -b feature/module-name`
2. **Development:** Work in respective component folder
3. **Testing:** Run component-specific tests
4. **Pull Request:** Submit PR with documentation
5. **Review & Merge:** CI/CD pipeline runs automatically
6. **Deploy:** Auto-deploy to staging, then production

## Getting Started

See individual README files in each component for setup instructions.

## Environment Configuration

Each component has `.env.example` - copy and configure:
```bash
cp .env.example .env
# Edit .env with your values
```

## Key Technologies

- **Mobile:** Android (Kotlin)
- **Web:** React/Next.js
- **Backend:** Node.js/Express
- **AI:** Python/TensorFlow
- **Database:** Firebase/Firestore
- **Hosting:** Google Cloud

---

*This structure supports scalability, maintainability, and team collaboration.*