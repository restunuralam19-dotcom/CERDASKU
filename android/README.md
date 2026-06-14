# CERDASKU Android Application

## Overview

Native Android application for CERDASKU platform built with modern Android architecture patterns.

### Tech Stack
- **Language:** Kotlin
- **Architecture:** MVVM with Clean Architecture
- **Database:** Room + Firebase Realtime Database
- **UI Framework:** Material Design 3 + Jetpack Compose (optional)
- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 34 (Android 14)

## Features

✅ Student Learning Modules (Reading, Writing, Math)  
✅ AI Handwriting Recognition  
✅ Real-time Leaderboard  
✅ Achievement Badge System  
✅ Offline-First Architecture  
✅ Cloud Synchronization  
✅ Parent & Teacher Notifications  
✅ Dark Mode Support  

## Project Structure

```
app/src/main/java/com/cerdasku/
├── activities/           # UI Activities
├── fragments/            # UI Fragments
├── services/             # Background Services
├── adapters/             # RecyclerView Adapters
├── models/               # Data Models
├── viewmodels/           # ViewModel Classes
├── repositories/         # Data Layer
├── database/             # Room Database
├── utils/                # Utility Classes
└── di/                   # Dependency Injection

app/src/main/res/
├── layout/               # XML Layout Files
├── drawable/             # Images & Vectors
├── values/               # Colors, Strings, Styles
└── menu/                 # Menu Resources
```

## Dependencies

- Jetpack (Lifecycle, Navigation, Compose)
- Firebase (Authentication, Database, Analytics)
- Hilt (Dependency Injection)
- Retrofit (HTTP Client)
- Glide (Image Loading)
- Room (Local Database)
- Coroutines (Async Programming)

## Setup Instructions

### Prerequisites
- Android Studio Hedgehog or later
- JDK 17+
- Android SDK 34+

### Installation

```bash
# Clone and navigate
git clone https://github.com/restunuralam19-dotcom/CERDASKU.git
cd CERDASKU/android

# Build the project
./gradlew build

# Run on emulator/device
./gradlew installDebug
```

### Firebase Setup

1. Download `google-services.json` from Firebase Console
2. Place it in `app/` directory
3. Add Firebase dependencies in `build.gradle`

### Environment Configuration

Create `.env` file:
```
FIREBASE_API_KEY=your_key
FIREBASE_PROJECT_ID=your_project
BACKEND_URL=https://api.cerdasku.id
AI_ENGINE_URL=https://ai.cerdasku.id
```

## Development Workflow

### Code Organization
- One Activity/Fragment per screen
- ViewModel for business logic
- Repository for data access
- Clear separation of concerns

### Testing
```bash
# Unit tests
./gradlew testDebugUnitTest

# Instrumented tests
./gradlew connectedAndroidTest
```

### Build Variants

- **Debug:** Full logging, mock data
- **Staging:** Test environment
- **Release:** Production optimized

## Architecture Patterns

### MVVM
```
View (Activity/Fragment)
  ↓
ViewModel (Logic)
  ↓
Repository (Data)
  ↓
DataSource (Firebase/Room)
```

### Clean Architecture Layers
- **Presentation:** UI components, ViewModels
- **Domain:** Use Cases, Entities
- **Data:** Repositories, Data Sources

## Database Schema

### Local Room Database
- Users
- Students
- Lessons
- Progress
- Achievements
- Offline Queue

### Firebase Collections
- `/users/{userId}`
- `/students/{studentId}`
- `/progress/{studentId}/lessons/{lessonId}`
- `/leaderboard/{level}`
- `/achievements/{studentId}`

## Key Features Implementation

### 1. Authentication
- Firebase Authentication
- Email/Password login
- Google Sign-In
- Biometric login

### 2. Offline Support
- Room database for local cache
- Sync queue for pending changes
- Automatic sync when online

### 3. Learning Modules
- Reading lessons with AI feedback
- Handwriting capture and analysis
- Math problems with step-by-step hints

### 4. Real-time Features
- Live leaderboard updates
- Push notifications
- Parent alerts

## Performance Optimization

- Image caching with Glide
- Database query optimization
- Background task scheduling
- Memory leak prevention
- Battery optimization

## Security Measures

- Encrypted local database
- Secure token storage
- SSL pinning
- Proguard/R8 obfuscation
- Input validation

## Debugging

### Logcat Filters
```bash
./gradlew logcat -s CERDASKU
```

### Firebase Debugger
- Enable in Firebase Console
- Real-time event tracking

## Troubleshooting

### Build Issues
```bash
./gradlew clean
./gradlew build --stacktrace
```

### Gradle Sync Problems
- Invalidate caches: File → Invalidate Caches
- Update Gradle wrapper

## Release Process

1. Update version in `build.gradle`
2. Run full test suite
3. Build signed APK/AAB
4. Upload to Google Play Console
5. Create GitHub release

## Resources

- [Android Documentation](https://developer.android.com)
- [Firebase for Android](https://firebase.google.com/docs/android/setup)
- [Kotlin Documentation](https://kotlinlang.org/docs)
- [Architecture Guide](../docs/ARCHITECTURE.md)

## Contributing

See [CONTRIBUTING.md](../CONTRIBUTING.md) for guidelines.

## License

MIT License - See [LICENSE](../LICENSE)

---

**Last Updated:** June 2026