# assets/db — Required File Missing

Place `Quran.db` (the 10.2 MB SQLite database) in this directory before building.

To obtain the file, extract it from the original XAPK:
```bash
# From the repository root:
unzip "कुरान मजीद (हिंदी)   __   Al Quran Hindi_2.2_APKPure.xapk"
unzip com.muslim.quran_hindi.apk assets/db/Quran.db
cp assets/db/Quran.db runnable-source/app/src/main/assets/db/
```

The app copies this file to private storage on first launch via `DatabaseHelper.manageDatabase()`.
