# $long_name;format="start-case"$

[![Build Status](https://travis-ci.org/TwilioDevEd/$name$.svg?branch=master)](https://travis-ci.org/TwilioDevEd/$name$)

<!--
  You can grab the appropriate description from https://www.twilio.com/docs/tutorials.
-->
SMS Two-Factor Authentication (SMS-2FA) helps keep your user accounts secure by validating two "factors" of identity. Most login systems only validate a password known by the user. You can make it harder for evildoers to compromise a user account by also validating something a user has, such as their mobile phone.

## Local Development

This project is build using [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html).

1. First clone this repository and `cd` into it.

   ```bash
   \$ git clone git@github.com:TwilioDevEd/sms2fa-servlets.git
   \$ cd sms2fa-servlets
   ```

1. Copy the sample configuration file and edit it to match your configuration.

   ```bash
   \$ cp .env.example .env
   ```

   You can find your `TWILIO_ACCOUNT_SID` and `TWILIO_AUTH_TOKEN` in your
   [Twilio Account Settings](https://www.twilio.com/user/account/settings).
   You will also need a `TWILIO_NUMBER`, which you may find [here](https://www.twilio.com/user/account/phone-numbers/incoming).
<!--
  Does this application depend on Authy?
  The `AUTHY_API_KEY` can be found [here](https://dashboard.authy.com/).
-->

   Run `source .env` to export the environment variables.

1. Make sure the tests succeed.

   ```bash
   \$ ./gradlew check
   ```

1. Start the server.

   ```bash
   \$ ./gradlew appRun
   ```

1. Check it out at [http://localhost:8080](http://localhost:8080).

## Meta

* No warranty expressed or implied. Software is as is. Diggity.
* [MIT License](http://www.opensource.org/licenses/mit-license.html)
* Lovingly crafted by Twilio Developer Education.
