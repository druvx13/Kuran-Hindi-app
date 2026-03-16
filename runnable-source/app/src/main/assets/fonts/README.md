# assets/fonts — Required Files Missing

Place the Arabic font files in `arabic/` subdirectory before building.

To obtain the files, extract them from the original XAPK:
```bash
# From the repository root:
unzip "कुरान मजीद (हिंदी)   __   Al Quran Hindi_2.2_APKPure.xapk"
unzip com.muslim.quran_hindi.apk "assets/fonts/arabic/*"
cp -r assets/fonts/arabic runnable-source/app/src/main/assets/fonts/
```

Required files in `arabic/`:
- `Al_Mushaf.ttf`
- `Al_Qalam_Quran_Majeed_2.ttf`
- `DroidNaskhRegular.ttf`
- `UthmanicHafs1_Ver09.otf`
- `me_quran.ttf`
- `noorehidayat.ttf`
- `noorehira.ttf`
- `noorehuda.ttf`
