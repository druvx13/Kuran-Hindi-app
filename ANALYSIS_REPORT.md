# XAPK Reverse Engineering & Analysis Report

**App Name:** कुरान मजीद (Al Quran Hindi)  
**Package:** `com.muslim.quran_hindi`  
**Version:** 2.2 (Version Code: 13)  
**Analyzed File:** `कुरान मजीद (हिंदी)   __   Al Quran Hindi_2.2_APKPure.xapk`  
**Analysis Date:** 2026-03-16  
**Tools Used:** `unzip`, `apktool 2.7.0`, `jadx 1.4.7`

---

## 1. XAPK Container Structure

The XAPK format is a ZIP archive containing multiple APK split files along with a `manifest.json` descriptor.

| File | Size | Description |
|---|---|---|
| `com.muslim.quran_hindi.apk` | 7.6 MB | Base APK (main application) |
| `config.xxxhdpi.apk` | 84 KB | Density-specific resources (XXXHDPI) |
| `config.en.apk` | 29 KB | English locale split |
| `config.zh.apk` | 21 KB | Chinese locale split |
| `config.ar.apk` | 17 KB | Arabic locale split |
| `config.ru.apk` | 17 KB | Russian locale split |
| `config.hi.apk` | 17 KB | Hindi locale split |
| `config.fr.apk` | 17 KB | French locale split |
| `config.de.apk` | 17 KB | German locale split |
| `config.es.apk` | 17 KB | Spanish locale split |
| `config.ja.apk` | 17 KB | Japanese locale split |
| `config.ko.apk` | 17 KB | Korean locale split |
| `config.my.apk` | 17 KB | Myanmar locale split |
| `config.pt.apk` | 17 KB | Portuguese locale split |
| `config.th.apk` | 17 KB | Thai locale split |
| `config.tr.apk` | 17 KB | Turkish locale split |
| `config.vi.apk` | 17 KB | Vietnamese locale split |
| `config.in.apk` | 13 KB | Indonesian locale split |
| `config.it.apk` | 13 KB | Italian locale split |
| `icon.png` | 235 KB | App launcher icon |
| `manifest.json` | 1.7 KB | XAPK metadata descriptor |

**Total XAPK Size:** ~8.2 MB  
**Locale Splits Supported:** af, am, ar, as, az, be, bg, bn, bs, ca, cs, da, de, el, en, es, et, eu, fa, fi, fr, gl, gu, hi, hr, hu, hy, in, is, it, iw, ja, ka, kk, km, kn, ko, ky, lo, lt, lv, mk, ml, mn, mr, ms, my, nb, ne, nl, or, pa, pl, pt, ro, ru, si, sk, sl, sq, sr, sv, sw, ta, te, th, tl, tr, uk, ur, uz, vi, zh, zu (74 locales total)

---

## 2. App Metadata (manifest.json)

```json
{
  "xapk_version": 2,
  "package_name": "com.muslim.quran_hindi",
  "name": "कुरान मजीद",
  "version_code": "13",
  "version_name": "2.2",
  "min_sdk_version": "16",
  "target_sdk_version": "28"
}
```

- **Minimum Android Version:** API 16 (Android 4.1 Jelly Bean)
- **Target Android Version:** API 28 (Android 9.0 Pie)
- **Compiled SDK:** API 29 (Android 10)

---

## 3. AndroidManifest.xml Analysis

### 3.1 Permissions

| Permission | Risk Level | Purpose |
|---|---|---|
| `android.permission.INTERNET` | Medium | Network access for audio streaming and ads |
| `android.permission.ACCESS_NETWORK_STATE` | Low | Check network connectivity |
| `android.permission.ACCESS_WIFI_STATE` | Low | Check WiFi state |
| `android.permission.READ_EXTERNAL_STORAGE` | Medium | Read files from SD card |
| `android.permission.WRITE_EXTERNAL_STORAGE` | Medium | Write audio files to SD card |
| `android.permission.WAKE_LOCK` | Low | Keep screen on during audio playback |
| `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE` | Low | Google Play install tracking |
| `com.google.android.c2dm.permission.RECEIVE` | Medium | Firebase Cloud Messaging (push notifications) |

**Security Note:** The app requests `READ_EXTERNAL_STORAGE` and `WRITE_EXTERNAL_STORAGE` for downloading Quran audio recitation files. These are broad permissions that grant access to all user files on external storage (not scoped storage).

### 3.2 Activities

| Activity Class | Description | Orientation | Theme |
|---|---|---|---|
| `com.muslim.Splash` | Splash/launcher screen | Portrait | Theme.Light.NoTitleBar.Fullscreen |
| `com.muslim.quran_hindi.QuranActivity` | Main Quran reading interface | Portrait | AppTheme |
| `com.muslim.hafizi.HafiziActivity11` | Hafizi (memorization) mode | Portrait | HafiziAppTheme |
| `com.muslim.Settings.SettingsActivity` | App settings | Portrait | SettingsAppTheme |
| `com.muslim.HomeSimple.HomeActivitySimple` | Simple home screen | Portrait | AppTheme |
| `com.muslim.home.HomeActivityNew` | Updated home screen | Portrait | AppTheme |
| `com.muslim.Search.SearchQuranActivity` | Quran verse search | Portrait | AppTheme |
| `com.muslim.Bookmark.Sura.SuraBookmarkActivity` | Surah bookmarks | Portrait | AppTheme |
| `com.muslim.Bookmark.Verses.VersesBookmarkActivity` | Verse bookmarks | Portrait | AppTheme |
| `com.google.android.gms.ads.AdActivity` | Google Ads interstitial | Any | Theme.Translucent |
| `com.google.android.gms.common.api.GoogleApiActivity` | Google API helper | Any | Theme.Translucent.NoTitleBar |

**Entry Point:** `com.muslim.Splash` (MAIN / LAUNCHER intent filter)  
**Flag:** `android:noHistory="true"` on Splash — it is removed from back stack after navigation.

### 3.3 Services

| Service | Exported | Description |
|---|---|---|
| `com.google.android.gms.measurement.AppMeasurementService` | No | Firebase Analytics measurement |
| `com.google.android.gms.measurement.AppMeasurementJobService` | No | Firebase Analytics job scheduling |
| `com.google.firebase.components.ComponentDiscoveryService` | No | Firebase component registration |

### 3.4 Broadcast Receivers

| Receiver | Exported | Permission | Intent Action |
|---|---|---|---|
| `com.google.android.gms.measurement.AppMeasurementReceiver` | No | — | — |
| `com.google.android.gms.measurement.AppMeasurementInstallReferrerReceiver` | **Yes** | `android.permission.INSTALL_PACKAGES` | `com.android.vending.INSTALL_REFERRER` |
| `com.google.firebase.iid.FirebaseInstanceIdReceiver` | **Yes** | `com.google.android.c2dm.permission.SEND` | `com.google.android.c2dm.intent.RECEIVE` |

### 3.5 Content Providers

| Provider | Exported | Authority |
|---|---|---|
| `com.google.android.gms.ads.MobileAdsInitProvider` | No | `com.muslim.quran_hindi.mobileadsinitprovider` |
| `com.google.firebase.provider.FirebaseInitProvider` | No | `com.muslim.quran_hindi.firebaseinitprovider` |

### 3.6 Application-Level Metadata

| Key | Value |
|---|---|
| `com.google.android.gms.version` | `@integer/google_play_services_version` |
| `com.google.android.gms.ads.APPLICATION_ID` | `ca-app-pub-8450164323120412~*` (redacted) |
| `com.android.vending.splits.required` | `true` |
| `com.android.vending.derived.apk.id` | `8` |

### 3.7 Network Security Configuration

```xml
<network-security-config>
    <base-config cleartextTrafficPermitted="true">
        <trust-anchors>
            <certificates src="system" />
        </trust-anchors>
    </base-config>
</network-security-config>
```

**Security Finding:** `cleartextTrafficPermitted="true"` allows unencrypted HTTP traffic. The app uses `http://download.quranicaudio.com/quran/abdurrahmaan_as-sudays/` for audio downloads, which is transmitted over plain HTTP without TLS encryption.

---

## 4. APK Resource Structure

### 4.1 Asset Files

```
assets/
├── db/
│   └── Quran.db         (10.2 MB — full Quran SQLite database)
├── fonts/
│   └── arabic/
│       ├── Al_Mushaf.ttf
│       ├── Al_Qalam_Quran_Majeed_2.ttf
│       ├── DroidNaskhRegular.ttf
│       ├── UthmanicHafs1_Ver09.otf
│       ├── me_quran.ttf
│       ├── noorehidayat.ttf
│       ├── noorehira.ttf
│       └── noorehuda.ttf
```

### 4.2 Raw Audio Resources

```
res/raw/
├── auzubillah_abdul_baset.mp3
├── auzubillah_al_afasy.mp3
├── auzubillah_ghamdi.mp3
├── auzubillah_sudais.mp3
├── bismillah_abdul_baset.mp3
├── bismillah_al_afasy.mp3
├── bismillah_ghamdi.mp3
└── bismillah_sudais.mp3
```

### 4.3 Resource Directories

| Directory | Count | Contents |
|---|---|---|
| `res/layout/` | 93 files | UI layout XML files |
| `res/drawable*/` | 11 variants | Images and drawable XML |
| `res/values*/` | 28 variants | Strings, styles, colors, dimensions |
| `res/anim/` | — | Animations |
| `res/xml/` | 2 files | `network_security_config.xml`, `splits0.xml` |

### 4.4 Key UI Layout Files

| Layout File | Purpose |
|---|---|
| `splash.xml` | Splash screen layout |
| `activity_hafizi.xml` | Hafizi memorization view |
| `activity_main_appbar.xml` | Main app bar |
| `activity_settings.xml` | Settings screen |
| `activity_search.xml` | Search screen |
| `activity_bookmark.xml` | Bookmark screen |
| `arabic_listview_details.xml` | Arabic verse display list |
| `arabic_pager_container.xml` | Page-based Quran view |
| `audio_range.xml` | Audio range selection dialog |

---

## 5. Decompiled Source Code Analysis

### 5.1 Application Package Structure

```
com.muslim
├── QuranApplication.java         (Application class)
├── Splash.java                   (Launcher Activity)
├── Bookmark/
│   ├── Sura/                     (Surah-level bookmarks)
│   │   ├── SuraBookmarkActivity.java
│   │   ├── SuraBookmarkGridViewAdapter.java
│   │   ├── SuraBookmarkListViewAdapter.java
│   │   └── model/
│   │       ├── SuraBookmarkQuranDetails.java
│   │       └── SuraBookmarkQuranSuras.java
│   └── Verses/                   (Verse-level bookmarks)
│       ├── VersesBookmarkActivity.java
│       └── model/
│           ├── VersesBookmarkQuranDetails.java
│           └── VersesBookmarkQuranSuras.java
├── Search/
│   ├── SearchQuranActivity.java
│   ├── SearchDetailsListAdapter.java
│   └── model/SearchQuranDetails.java
├── Settings/
│   ├── SettingsActivity.java
│   └── MyDrawerLayout.java
├── hafizi/
│   ├── HafiziActivity11.java     (Page-image based Quran viewer)
│   ├── ImgAdapter11.java
│   ├── ParaListViewAdapter.java
│   ├── SurahListViewAdapter.java
│   └── QuranJuzs.java
├── necessary/
│   ├── db/
│   │   ├── DatabaseAccessor.java (SQLite singleton accessor)
│   │   ├── DatabaseHelper.java   (SQLite helper / DB copy from assets)
│   │   └── PreviousDatabaseAccessor.java
│   └── utils/
│       ├── Constants.java        (App-wide constants & SharedPrefs keys)
│       ├── Utils.java            (SharedPreferences utilities)
│       ├── ArabicFarsiUrduGlyphUtils.java (RTL glyph shaping)
│       ├── CustomTypefaceSpan.java
│       └── Grammer.java
└── quran_hindi/
    ├── QuranActivity.java        (Main reading activity)
    ├── BuildConfig.java
    ├── R.java                    (Resource IDs)
    ├── ViewPagerAdapter.java
    ├── ViewPagerFragment.java
    ├── ViewPagerFragmentReading.java
    ├── GridViewAdapter.java
    ├── ListViewAdapter.java
    ├── DetailsListAdapter.java
    ├── CustomViewPager.java
    ├── customview/
    │   ├── CustomHandleBehavior.java
    │   └── CustomScrollerViewProvider.java
    ├── extras/
    │   ├── Num114.java           (Surah count data)
    │   └── SuraAdapter114.java
    └── model/
        ├── QuranDetails.java
        └── QuranSuras.java
```

**Total App-Specific Java Classes:** 63

### 5.2 Application Initialization (`QuranApplication.java`)

The `Application` class performs the following on startup:

1. **Arabic Font Selection** based on API level:
   - API ≥ 18: `UthmanicHafs1_Ver09.otf` (Qalam Majeed)
   - API 17: `me_quran.ttf`
   - API 14–16: `Al_Mushaf.ttf`
   - API < 14: `DroidNaskhRegular.ttf`

2. **SharedPreferences initialization** for:
   - Arabic font type (Uthmanic / IndoPak / Simple)
   - Hindi translation selection (default: Farooq Khan & Nadwi)
   - Quranic reciter selection (default: Al-Afasy)
   - Reading mode, transliteration toggles

### 5.3 Splash Screen & Database Initialization

The `Splash` activity uses `AsyncTask` to:
1. Copy the bundled `Quran.db` SQLite database from assets to the app's private database directory (`/data/data/com.muslim.quran_hindi/databases/Quran4.db`) if it does not already exist
2. Navigate to `QuranActivity` after 500 ms

**Database Note:** The Quran SQLite database (`Quran.db`, 10.2 MB) is bundled directly in the APK assets, making the app fully offline-capable for reading.

### 5.4 Database Schema (DatabaseHelper.java)

- **Database Name:** `Quran4.db`
- **Database Version:** 4
- **Source Asset:** `db/Quran.db`
- **Install Path:** `/data/data/com.muslim.quran_hindi/databases/Quran4.db`
- **Access Pattern:** Singleton via `DatabaseAccessor` with separate readable (`rdb`) and writable (`wdb`) database handles

### 5.5 Constants and Configuration (`Constants.java`)

Key application constants:

| Constant | Value |
|---|---|
| `AD_UNIT_ID` | `ca-app-pub-8450164323120412/...` (redacted) |
| `QURAN_STANDARD_URL` | `http://download.quranicaudio.com/quran/abdurrahmaan_as-sudays/` |
| `QURAN_DIRECTORY` | `QuranIDEA` |
| `INTERNAL_STORAGE_DIRECTORY_START_VERSION` | 29 (API 29+) |

**Supported Reciters:** Sudais, Al-Afasy (default), Abdul Baset, Ghamdi  
**Supported Arabic Font Styles:** Al-Mushaf, Me Quran, Noor-e-Hidayat, Noor-e-Hira, Noor-e-Huda, Qalam Majeed, Uthmanic  
**Supported Translators (Hindi):** Farooq Khan & Nadwi (`hi_farooq`), Farooq Khan & Ahmed (`hi_hindi`)

### 5.6 App Features Summary

- **Quran Reading:** Text-based Arabic with Hindi translation and transliteration
- **Hafizi Mode:** Page-image based Quran viewer for memorization (`HafiziActivity11`)
- **Search:** Full-text verse search (`SearchQuranActivity`)
- **Bookmarks:** Surah-level and verse-level bookmarking
- **Audio Playback:** Online streaming of recitations by 4 reciters from `quranicaudio.com`
- **Settings:** Font selection, font size adjustment, translator selection, reciter selection, reading mode, transliteration toggle, last-read marker
- **Offline Support:** Full Quran database bundled in APK (no internet required for reading)

---

## 6. Third-Party SDK Inventory

| SDK | Package | Purpose |
|---|---|---|
| Google AdMob | `com.google.ads`, `com.google.android.gms.ads` | In-app advertising |
| Firebase Analytics | `com.google.firebase.analytics`, `com.google.firebase.measurement` | Usage analytics & crash reporting |
| Firebase Instance ID / FCM | `com.google.firebase.iid` | Push notifications |
| Google Play Services | `com.google.android.gms` | Core Google services |
| AndroidX (AppCompat, RecyclerView, etc.) | `androidx.*` | UI support library |
| RecyclerView FastScroll | `com.futuremind.recyclerviewfastscroll` | Fast scrolling in lists |
| Clans FAB | `com.github.clans.fab` | Floating Action Button |

---

## 7. Build & Signing Information

| Property | Value |
|---|---|
| Build Type | `release` |
| Debug Flag | `false` |
| Signing Scheme | APK Signature Scheme v2 |
| Signer Tool | `BNDLTOOL` (Android App Bundle tool) |
| Compile SDK | API 29 (Android 10) |
| Min SDK | API 16 (Android 4.1) |
| Target SDK | API 28 (Android 9) |

---

## 8. Security Findings Summary

| # | Finding | Severity | Details |
|---|---|---|---|
| 1 | **Cleartext HTTP traffic allowed** | Medium | `network_security_config.xml` sets `cleartextTrafficPermitted="true"`. Audio files are downloaded over plain `http://` from `quranicaudio.com`. Susceptible to man-in-the-middle interception of audio. |
| 2 | **Hardcoded Google API Key** | Low | `google_api_key` / `google_crash_reporting_api_key` are hardcoded in `strings.xml` (value redacted). If the key is leaked it could be used to query Firebase/Google services associated with this project. |
| 3 | **Hardcoded AdMob App ID & Ad Unit** | Informational | `admob_app_id` and `AD_UNIT_ID` are hardcoded in resources and Java (values redacted). These are expected but could be used for ad fraud if extracted. |
| 4 | **Exported Receiver without fine-grained permission check** | Low | `AppMeasurementInstallReferrerReceiver` is exported with `android.permission.INSTALL_PACKAGES` — this is a standard Google Play referrer pattern but the permission name is broad. |
| 5 | **Broad External Storage permissions** | Low | `READ_EXTERNAL_STORAGE` and `WRITE_EXTERNAL_STORAGE` grant access to all of external storage (not scoped). On API < 29 this is full SD card access. |
| 6 | **Target SDK below current recommendation** | Informational | Target SDK is 28 (Android 9). Google Play now requires target SDK ≥ 33. App may expose users to OS-level security mitigations not being applied. |
| 7 | **AsyncTask deprecated usage** | Informational | `Splash.java` uses `AsyncTask` (deprecated in API 30) for database initialization. Not a security issue, but a maintenance concern. |
| 8 | **Firebase project credentials exposed** | Informational | `firebase_database_url`, `gcm_defaultSenderId`, `google_app_id`, and `project_id` are embedded in `strings.xml`. These are required for Firebase to work but represent information disclosure if the app is not rate-limited on the Firebase side. |

---

## 9. Extracted Artifacts

All extracted artifacts are located in `/tmp/xapk_analysis/` (not committed to repository):

```
/tmp/xapk_analysis/
├── xapk_extracted/          ← All APK splits extracted from XAPK
│   ├── com.muslim.quran_hindi.apk
│   ├── config.*.apk         ← Locale and density splits
│   ├── manifest.json
│   └── icon.png
├── apktool_output/          ← apktool decompilation (resources + manifest)
│   ├── AndroidManifest.xml
│   ├── apktool.yml
│   ├── assets/
│   │   ├── db/Quran.db
│   │   └── fonts/arabic/
│   ├── res/                 ← All decoded resources
│   └── classes.dex          ← Raw Dalvik bytecode
└── jadx_output/             ← jadx decompilation (Java source code)
    └── sources/
        └── com/muslim/      ← 63 decompiled Java source files
```

---

## 10. Conclusion

**कुरान मजीद (Al Quran Hindi)** v2.2 is a straightforward Quran reading application for Hindi-speaking users. It bundles the complete Quran text in a local SQLite database (10.2 MB), supports Arabic text with Hindi translation and transliteration, provides audio recitation streaming from `quranicaudio.com`, and integrates Google AdMob for monetization and Firebase for analytics.

The app's security posture is typical for a consumer Android application of its era (targeting API 28). The most notable finding is the explicit cleartext HTTP permission enabling unencrypted audio downloads. No malware indicators, suspicious native libraries, dynamic code loading, reflection-based obfuscation, or unexpected data exfiltration patterns were identified in the static analysis.
