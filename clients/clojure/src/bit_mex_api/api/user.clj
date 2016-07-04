(ns bit-mex-api.api.user
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn user-cancel-withdrawal-with-http-info
  "Cancel a withdrawal."
  [token ]
  (call-api "/user/cancelWithdrawal" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-cancel-withdrawal
  "Cancel a withdrawal."
  [token ]
  (:data (user-cancel-withdrawal-with-http-info token)))

(defn user-check-referral-code-with-http-info
  "Check if a referral code is valid.
  If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404."
  ([] (user-check-referral-code-with-http-info nil))
  ([{:keys [referral-code ]}]
   (call-api "/user/checkReferralCode" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"referralCode" referral-code }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-check-referral-code
  "Check if a referral code is valid.
  If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404."
  ([] (user-check-referral-code nil))
  ([optional-params]
   (:data (user-check-referral-code-with-http-info optional-params))))

(defn user-confirm-email-with-http-info
  "Confirm your email address with a token."
  [token ]
  (call-api "/user/confirmEmail" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-confirm-email
  "Confirm your email address with a token."
  [token ]
  (:data (user-confirm-email-with-http-info token)))

(defn user-confirm-enable-tfa-with-http-info
  "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint."
  ([token ] (user-confirm-enable-tfa-with-http-info token nil))
  ([token {:keys [type ]}]
   (call-api "/user/confirmEnableTFA" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"type" type "token" token }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-confirm-enable-tfa
  "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint."
  ([token ] (user-confirm-enable-tfa token nil))
  ([token optional-params]
   (:data (user-confirm-enable-tfa-with-http-info token optional-params))))

(defn user-confirm-password-reset-with-http-info
  "Confirm a password reset."
  [token new-password ]
  (call-api "/user/confirmPasswordReset" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token "newPassword" new-password }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-confirm-password-reset
  "Confirm a password reset."
  [token new-password ]
  (:data (user-confirm-password-reset-with-http-info token new-password)))

(defn user-confirm-withdrawal-with-http-info
  "Confirm a withdrawal."
  [token ]
  (call-api "/user/confirmWithdrawal" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-confirm-withdrawal
  "Confirm a withdrawal."
  [token ]
  (:data (user-confirm-withdrawal-with-http-info token)))

(defn user-disable-tfa-with-http-info
  "Disable two-factor auth for this account."
  ([token ] (user-disable-tfa-with-http-info token nil))
  ([token {:keys [type ]}]
   (call-api "/user/disableTFA" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"type" type "token" token }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-disable-tfa
  "Disable two-factor auth for this account."
  ([token ] (user-disable-tfa token nil))
  ([token optional-params]
   (:data (user-disable-tfa-with-http-info token optional-params))))

(defn user-get-with-http-info
  "Get your user model."
  []
  (call-api "/user" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-get
  "Get your user model."
  []
  (:data (user-get-with-http-info)))

(defn user-get-affiliate-status-with-http-info
  "Get your current affiliate/referral status."
  []
  (call-api "/user/affiliateStatus" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-get-affiliate-status
  "Get your current affiliate/referral status."
  []
  (:data (user-get-affiliate-status-with-http-info)))

(defn user-get-commission-with-http-info
  "Get your account's commission status."
  []
  (call-api "/user/commission" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-get-commission
  "Get your account's commission status."
  []
  (:data (user-get-commission-with-http-info)))

(defn user-get-deposit-address-with-http-info
  "Get a deposit address."
  ([] (user-get-deposit-address-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/depositAddress" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-get-deposit-address
  "Get a deposit address."
  ([] (user-get-deposit-address nil))
  ([optional-params]
   (:data (user-get-deposit-address-with-http-info optional-params))))

(defn user-get-margin-with-http-info
  "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies."
  ([] (user-get-margin-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/margin" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-get-margin
  "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies."
  ([] (user-get-margin nil))
  ([optional-params]
   (:data (user-get-margin-with-http-info optional-params))))

(defn user-get-wallet-history-with-http-info
  "Get a history of all of your wallet transactions (deposits and withdrawals)."
  ([] (user-get-wallet-history-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/walletHistory" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-get-wallet-history
  "Get a history of all of your wallet transactions (deposits and withdrawals)."
  ([] (user-get-wallet-history nil))
  ([optional-params]
   (:data (user-get-wallet-history-with-http-info optional-params))))

(defn user-login-with-http-info
  "Log in to BitMEX."
  ([email password ] (user-login-with-http-info email password nil))
  ([email password {:keys [token ]}]
   (call-api "/user/login" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"email" email "password" password "token" token }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-login
  "Log in to BitMEX."
  ([email password ] (user-login email password nil))
  ([email password optional-params]
   (:data (user-login-with-http-info email password optional-params))))

(defn user-logout-with-http-info
  "Log out of BitMEX."
  []
  (call-api "/user/logout" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-logout
  "Log out of BitMEX."
  []
  (:data (user-logout-with-http-info)))

(defn user-logout-all-with-http-info
  "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices."
  []
  (call-api "/user/logoutAll" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-logout-all
  "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices."
  []
  (:data (user-logout-all-with-http-info)))

(defn user-new-with-http-info
  "Register a new user."
  ([email password country ] (user-new-with-http-info email password country nil))
  ([email password country {:keys [username firstname lastname accepts-tos referrer-id tfa-type tfa-token ]}]
   (call-api "/user" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"email" email "password" password "username" username "firstname" firstname "lastname" lastname "acceptsTOS" accepts-tos "referrerID" referrer-id "country" country "tfaType" tfa-type "tfaToken" tfa-token }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-new
  "Register a new user."
  ([email password country ] (user-new email password country nil))
  ([email password country optional-params]
   (:data (user-new-with-http-info email password country optional-params))))

(defn user-request-enable-tfa-with-http-info
  "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys."
  ([] (user-request-enable-tfa-with-http-info nil))
  ([{:keys [type ]}]
   (call-api "/user/requestEnableTFA" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"type" type }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-request-enable-tfa
  "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys."
  ([] (user-request-enable-tfa nil))
  ([optional-params]
   (:data (user-request-enable-tfa-with-http-info optional-params))))

(defn user-request-password-reset-with-http-info
  "Request a password reset."
  [email ]
  (call-api "/user/requestPasswordReset" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"email" email }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-request-password-reset
  "Request a password reset."
  [email ]
  (:data (user-request-password-reset-with-http-info email)))

(defn user-request-withdrawal-with-http-info
  "Request a withdrawal to an external wallet.
  This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission."
  ([currency amount address ] (user-request-withdrawal-with-http-info currency amount address nil))
  ([currency amount address {:keys [otp-token fee ]}]
   (call-api "/user/requestWithdrawal" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"otpToken" otp-token "currency" currency "amount" amount "address" address "fee" fee }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-request-withdrawal
  "Request a withdrawal to an external wallet.
  This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission."
  ([currency amount address ] (user-request-withdrawal currency amount address nil))
  ([currency amount address optional-params]
   (:data (user-request-withdrawal-with-http-info currency amount address optional-params))))

(defn user-save-preferences-with-http-info
  "Save user preferences."
  ([prefs ] (user-save-preferences-with-http-info prefs nil))
  ([prefs {:keys [overwrite ]}]
   (call-api "/user/preferences" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"prefs" prefs "overwrite" overwrite }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-save-preferences
  "Save user preferences."
  ([prefs ] (user-save-preferences prefs nil))
  ([prefs optional-params]
   (:data (user-save-preferences-with-http-info prefs optional-params))))

(defn user-send-verification-email-with-http-info
  "Re-send verification email."
  [email ]
  (call-api "/user/resendVerificationEmail" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"email" email }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-send-verification-email
  "Re-send verification email."
  [email ]
  (:data (user-send-verification-email-with-http-info email)))

(defn user-update-with-http-info
  "Update your password, name, and other attributes."
  ([] (user-update-with-http-info nil))
  ([{:keys [firstname lastname old-password new-password new-password-confirm username country pgp-pub-key ]}]
   (call-api "/user" :put
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"firstname" firstname "lastname" lastname "oldPassword" old-password "newPassword" new-password "newPasswordConfirm" new-password-confirm "username" username "country" country "pgpPubKey" pgp-pub-key }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-update
  "Update your password, name, and other attributes."
  ([] (user-update nil))
  ([optional-params]
   (:data (user-update-with-http-info optional-params))))

