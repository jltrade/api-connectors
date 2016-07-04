(ns bit-mex-api.api.position
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn position-get-with-http-info
  "Get your positions.
  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields."
  ([] (position-get-with-http-info nil))
  ([{:keys [filter columns count ]}]
   (call-api "/position" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter" filter "columns" columns "count" count }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn position-get
  "Get your positions.
  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields."
  ([] (position-get nil))
  ([optional-params]
   (:data (position-get-with-http-info optional-params))))

(defn position-isolate-margin-with-http-info
  "Enable isolated margin or cross margin per-position.
  On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off."
  ([symbol ] (position-isolate-margin-with-http-info symbol nil))
  ([symbol {:keys [enabled ]}]
   (call-api "/position/isolate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "enabled" enabled }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn position-isolate-margin
  "Enable isolated margin or cross margin per-position.
  On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off."
  ([symbol ] (position-isolate-margin symbol nil))
  ([symbol optional-params]
   (:data (position-isolate-margin-with-http-info symbol optional-params))))

(defn position-transfer-isolated-margin-with-http-info
  "Transfer equity in or out of a position.
  When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold."
  [symbol amount ]
  (call-api "/position/transferMargin" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "amount" amount }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn position-transfer-isolated-margin
  "Transfer equity in or out of a position.
  When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold."
  [symbol amount ]
  (:data (position-transfer-isolated-margin-with-http-info symbol amount)))

(defn position-update-leverage-with-http-info
  "Choose leverage for a position.
  On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin."
  [symbol leverage ]
  (call-api "/position/leverage" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "leverage" leverage }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn position-update-leverage
  "Choose leverage for a position.
  On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin."
  [symbol leverage ]
  (:data (position-update-leverage-with-http-info symbol leverage)))

