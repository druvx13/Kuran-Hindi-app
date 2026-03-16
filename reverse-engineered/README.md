# Reverse-Engineered Source Code

This directory contains the complete decompiled output of the base APK extracted from
`कुरान मजीद (हिंदी)   __   Al Quran Hindi_2.2_APKPure.xapk` (package `com.muslim.quran_hindi`, v2.2).

Two independent decompilation tools were used to maximize coverage and readability.

---

## Directory Structure

```
reverse-engineered/
├── apktool/              ← apktool 2.7.0 output (decoded resources + manifest)
│   ├── AndroidManifest.xml
│   ├── apktool.yml
│   ├── res/              ← Decoded XML resources (layouts, values, drawables, …)
│   ├── assets/
│   │   ├── db/           ← Quran.db excluded (binary, 10.2 MB) — see db/README.md
│   │   └── fonts/        ← Font files excluded (binary TTF/OTF) — see fonts/README.md
│   ├── original/         ← Original META-INF (signing certificates / manifests)
│   └── unknown/          ← Firebase / Google Play .properties files
└── jadx/
    └── sources/          ← jadx 1.4.7 Java decompilation (~5 400 files)
        ├── com/muslim/   ← App source code (63 classes)
        ├── androidx/     ← AndroidX support library sources
        ├── com/google/   ← Firebase, GMS, AdMob sources
        └── …
```

> **Note on Smali:** The full Dalvik/Smali disassembly (~7 870 files, 76 MB) is not committed
> because it is redundant with the human-readable jadx Java sources. To regenerate Smali, run:
> ```bash
> apktool d com.muslim.quran_hindi.apk -o apktool_smali_output
> ```

---

## Excluded Binary Files

The following binary files are **not committed** to avoid bloating the repository. They are
already embedded in the original XAPK file at the repository root and can be extracted from it.

| Path (within `apktool/`) | Type | Size | Reason |
|---|---|---|---|
| `assets/db/Quran.db` | SQLite database | 10.2 MB | Large binary; already in XAPK |
| `assets/fonts/arabic/*.ttf` / `*.otf` | Font files | ~1.5 MB total | Binary; already in XAPK |
| `res/raw/*.mp3` | Audio files | ~369 KB total | Binary; already in XAPK |

See the `README.md` files inside those directories for the full file lists.

---

## Tools Used

| Tool | Version | Purpose |
|---|---|---|
| `unzip` | system | Extract XAPK container |
| `apktool` | 2.7.0 | Decode resources, disassemble Dalvik bytecode to Smali |
| `jadx` | 1.4.7 | Decompile Dalvik bytecode to Java source |

---

## App Summary

| Property | Value |
|---|---|
| App Name | कुरान मजीद (Al Quran Hindi) |
| Package | `com.muslim.quran_hindi` |
| Version | 2.2 (code 13) |
| Min SDK | API 16 (Android 4.1) |
| Target SDK | API 28 (Android 9) |
| Compiled SDK | API 29 (Android 10) |

For the full security and structural analysis see [`ANALYSIS_REPORT.md`](../ANALYSIS_REPORT.md) at
the repository root.
