# Nekogram Mod – Privacy-Focused Build

This is a community build of [Nekogram](https://github.com/Nekogram/Nekogram) with Firebase Analytics and FCM services fully removed.

## ⚠️ Why this build exists

Based on public analysis ([source](https://thebadinteger.github.io/nekogram-phone-exfiltration/)), official Nekogram builds contain a mechanism that sends your phone number and user ID to a bot (`@nekonotificationbot`) via inline requests.

This build is compiled **without** the `HELPER_BOT_ID` and `HELPER_BOT_USERNAME` secrets, so this mechanism should be completely inactive.

## 📦 Downloads

Check the [Releases](https://github.com/monstera90/Nekogram/releases) page for APKs.

Available architectures:
- arm64-v8a
- armeabi-v7a  
- x86
- x86_64
- universal

## 🛠️ Changes from official Nekogram

- Removed Firebase Analytics and FCM (Google push notifications)
- Removed Firebase App Indexing
- Sentry disabled by default (no DSN configured)
- No HELPER_BOT_ID/USERNAME secrets in the build

## 📱 Compatibility

- Android 7.0+ (API 24+)
- Built with NDK 27.3.13750724

## 🔒 Privacy

This build does not send any analytics data, crash reports, or personal information to third-party services. All network communication is limited to Telegram's own servers.

## ⚠️ Disclaimer

This is an **unofficial community build**. Use at your own risk. I am not affiliated with the original Nekogram authors.

## 📝 Source Code

https://github.com/monstera90/Nekogram

## 🙏 Credits

- [Nekogram](https://github.com/Nekogram/Nekogram) — original project
- [The Bad Integer](https://thebadinteger.github.io/nekogram-phone-exfiltration/) — privacy analysis