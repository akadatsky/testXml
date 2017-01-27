package com.rocketshield.testparser;

public class DataSource {

    private static String data = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "    <head>\n" +
            "        <title>SampleApp</title>\n" +
            "        <meta name=\"viewport\" content=\"user-scalable=no,initial-scale=1,maximum-scale=1\" />\n" +
            "        <link href=\"https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/O2aKM2iSbOw.png\" rel=\"apple-touch-icon-precomposed\" sizes=\"196x196\" />\n" +
            "        <meta name=\"referrer\" content=\"origin-when-crossorigin\" id=\"meta_referrer\" />\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" data-bootloader-hash=\"FYGON\" href=\"https://static.xx.fbcdn.net/rsrc.php/v3/yZ/r/bBw59eEJhNi.css\" />\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" data-bootloader-hash=\"4oCaF\" href=\"https://static.xx.fbcdn.net/rsrc.php/v3/yj/r/DGB5L-gUKmy.css\" />\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" data-bootloader-hash=\"sRipl\" href=\"https://static.xx.fbcdn.net/rsrc.php/v3/y8/r/gXCce3oyC2-.css\" />\n" +
            "        <script id=\"u_0_9\">function envFlush(a){function b(c){for(var d in a)c[d]=a[d];}if(window.requireLazy){window.requireLazy(['Env'],b);}else{window.Env=window.Env||{};b(window.Env);}}envFlush({\"timeslice_heartbeat_config\":{\"pollIntervalMs\":33,\"idleGapThresholdMs\":60,\"ignoredTimesliceNames\":{\"requestAnimationFrame\":true,\"Event listenHandler mousemove\":true,\"Event listenHandler mouseover\":true,\"Event listenHandler mouseout\":true,\"Event listenHandler scroll\":true},\"enableOnRequire\":false},\"shouldLogCounters\":true,\"timeslice_categories\":{\"react_render\":true,\"reflow\":true}});</script>\n" +
            "        <script>document.domain = 'facebook.com';if(/^#~?!(?:\\/?[\\w\\.-])+\\/?(?:\\?|$)/.test(location.hash))location.replace(location.hash.substr(location.hash.indexOf('!')+1));window.FB_GKS={\"mobile_chrono_selector\":true,\"mobile_js_show_debug\":false,\"mobile_js_log_error\":false,\"m_js_log_history\":false,\"js_nocatch\":false,\"moulder_feed_hide_toggle\":false,\"m_onephase_home\":true,\"local_storage_cache\":false,\"mtouch_composer_no_autoresize\":true,\"m_js_crossorigin_attribute\":true};window.FB_QES={};</script>\n" +
            "        <script>__DEV__=0;</script>\n" +
            "        <script id=\"u_0_a\" crossorigin=\"anonymous\" src=\"https://static.xx.fbcdn.net/rsrc.php/v3iAQ94/yY/l/en_US/BcT03fMQI0f.js\" data-bootloader-hash=\"tN1V5\"></script>\n" +
            "        <script id=\"u_0_b\">(function _(a,b,c,d){if(!a){document.cookie=b+'=;expires=Thu, 01-Jan-1970 00:00:01 GMT';document.cookie=c+'=;expires=Thu, 01-Jan-1970 00:00:01 GMT';return;}var e=null;if(navigator.userAgent.indexOf('Firefox')!==-1||!window.devicePixelRatio&&navigator.userAgent.indexOf('Windows Phone')!==-1){e=screen.width/document.documentElement.offsetWidth;e=Math.max(1,Math.floor(e*2)/2);}if((!e||e===1)&&navigator.userAgent.indexOf('IEMobile')!==-1){e=Math.sqrt(screen.deviceXDPI*screen.deviceYDPI)/96;e=Math.max(1,Math.round(e*2)/2);}document.cookie=b+'='+(e||window.devicePixelRatio||1);var f=window.screen?screen.width:0,g=window.screen?screen.height:0;document.cookie=c+'='+f+'x'+g;if(d&&document.cookie&&window.devicePixelRatio>1)document.location.reload();})(true, \"m_pixel_ratio\", \"wd\", false);</script>\n" +
            "    </head>\n" +
            "    <body tabindex=\"0\" class=\"_5e79 bare app_requests touch x1 _fzu _50-3 aclb\">\n" +
            "        <script id=\"u_0_8\">(function(a){a.__updateOrientation=function(){var b=!!a.orientation&&a.orientation!==180,c=document.body;if(c)c.className=c.className.replace(/(^|\\s)(landscape|portrait)(\\s|$)/g,' ')+' '+(b?'landscape':'portrait');return b;};})(window);</script>\n" +
            "        <div id=\"viewport\" class=\"_2jup\">\n" +
            "            <h4 style=\"display:block;height:0;overflow:hidden;position:absolute;width:0;padding:0\">Facebook</h4>\n" +
            "            <div id=\"page\">\n" +
            "                <div class=\"_129_\" id=\"header-notices\"></div>\n" +
            "                <div class=\"_52z5 _451a mFuturePageHeader _1uh1 _35dx titled\" data-sigil=\"MTopBlueBarHeader\">\n" +
            "                    <div class=\"_4g33 _52we\">\n" +
            "                        <div class=\"_5s61\">\n" +
            "                            <div class=\"_52z7\">\n" +
            "                                <button type=\"submit\" value=\"Cancel\" class=\"btn btnI bgb mfss touchable\" name=\"__CANCEL__\" data-sigil=\"cancel dialog-header-button-__CANCEL__ blocking-touchable\">Cancel</button>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"_4g34\">\n" +
            "                            <div class=\"_52z6\">\n" +
            "                                <div class=\"_50l4 mfsl fcw\" id=\"m-future-page-header-title\" data-sigil=\"m-dialog-header-title\">SampleApp</div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"_5s61\">\n" +
            "                            <div class=\"_52z8 _3rfl\">\n" +
            "                                <button type=\"submit\" value=\"Send\" class=\"btn btnI bgb mfss touchable\" name=\"__CONFIRM__\" id=\"u_0_0\" data-sigil=\"confirm m-dialog-confirm-button dialog-header-button-__CONFIRM__ blocking-touchable\">Send</button>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    <div id=\"pagelet_0_0\"></div>\n" +
            "                </div>\n" +
            "                <div class=\"_52yp app_requests _52yp aclb\" id=\"root\" role=\"main\" data-sigil=\"context-layer-root content-pane\">\n" +
            "                    <div class=\"_3t\" id=\"u_0_1\">\n" +
            "                        <form method=\"post\" class=\"_4x22\" id=\"platformDialogForm\" action=\"/v2.2/dialog/app_requests/submit\">\n" +
            "                            <input type=\"hidden\" name=\"lsd\" value=\"AVrSsxEH\" autocomplete=\"off\" />\n" +
            "                            <input type=\"hidden\" name=\"from_post\" value=\"1\" />\n" +
            "                            <div class=\"_5td7\" id=\"platformDialogContent\">\n" +
            "                                <input type=\"hidden\" name=\"app_id\" value=\"203870956311623\" />\n" +
            "                                <input type=\"hidden\" name=\"redirect_uri\" value=\"fbconnect://success\" />\n" +
            "                                <input type=\"hidden\" name=\"display\" value=\"touch\" />\n" +
            "                                <input type=\"hidden\" name=\"access_token\" value=\"EAAC5a2fuVEcBAH9SQkhO5kaNBZA5lv84qOrpCm4wawDOEOXUZBUROCjCOGuFsYpaEeCoSr6JQKNxMU7DlJUXFd908WWmwqA3IQnMqyA5binL39WtHrvknWNMz7qpuFW0T33S20MEjZBT8M30BZCcBGBhHG2uK0La1AxIk9H32AN1x9aBjLG89d1ixI5neqlsSd33pdxCszumZB5tz9ZBto\" />\n" +
            "                                <input type=\"hidden\" name=\"sdk\" />\n" +
            "                                <input type=\"hidden\" name=\"proxy_access_token\" />\n" +
            "                                <div class=\"_5q1p\">\n" +
            "                                    <input type=\"hidden\" name=\"message\" value=\"Join me on SampleApp!\" />\n" +
            "                                    <input type=\"hidden\" name=\"data\" />\n" +
            "                                    <input type=\"hidden\" name=\"frictionless\" />\n" +
            "                                    <input type=\"hidden\" name=\"to\" value=\"100011271369298,100014940944975\" />\n" +
            "                                    <div>\n" +
            "                                        <span class=\"_3cw fcg\">To:</span>\n" +
            "                                        <ul class=\"mTokenarea\">\n" +
            "                                            <li class=\"mToken\" data-sigil=\"token\">Andrei Synergetica\n" +
            "                                                <input type=\"hidden\" name=\"[]\" />\n" +
            "                                                <input type=\"hidden\" name=\"text_[]\" value=\"Andrei Synergetica\" />\n" +
            "                                            </li>\n" +
            "                                            <li class=\"mToken\" data-sigil=\"token\">AndreiTwo MasalykinTwo\n" +
            "                                                <input type=\"hidden\" name=\"[]\" />\n" +
            "                                                <input type=\"hidden\" name=\"text_[]\" value=\"AndreiTwo MasalykinTwo\" />\n" +
            "                                            </li>\n" +
            "                                        </ul>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"ib _3cv\">\n" +
            "                                        <i class=\"img l profpic\" aria-label=\"Andrei Masalykin\" role=\"img\" style=\"background:#d8dce6 url(&quot;https://scontent-fra3-1.xx.fbcdn.net/v/t1.0-1/cp0/e15/q65/c15.0.50.50/p50x50/10354686_10150004552801856_220367501106153455_n.jpg?oh=23cbc5c223a17d641101a76d30164df8&amp;oe=5906DEF8&quot;) no-repeat center;background-size:100% 100%;-webkit-background-size:100% 100%;width:50px;height:50px;\"></i>\n" +
            "                                        <div class=\"c\">\n" +
            "                                            <div>\n" +
            "                                                <strong>Andrei Masalykin</strong> sent you a\n" +
            "                                                <strong>Welcome</strong> request:\n" +
            "                                            </div>\n" +
            "                                            <div class=\"mfss fcg\">Join me on SampleApp!</div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                        </form>\n" +
            "                    </div>\n" +
            "                    <p class=\"_52jc _52jj _52e- _474p\" aria-hidden=\"true\">Logged in as Andrei Masalykin</p>\n" +
            "                    <p class=\"_52jc _52jj _52e- _474r\">Logged in as Andrei Masalykin</p>\n" +
            "                    <div>\n" +
            "                        <div>\n" +
            "                            <iframe id=\"u_0_3\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" height=\"1\" width=\"1\"></iframe>\n" +
            "                            <iframe id=\"u_0_4\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" height=\"1\" width=\"1\"></iframe>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"viewportArea _2v9s\" id=\"u_0_2\" style=\"display:none\" data-sigil=\"marea\">\n" +
            "                    <div class=\"_5vsg\" id=\"u_0_5\"></div>\n" +
            "                    <div class=\"_5vsh\" id=\"u_0_6\"></div>\n" +
            "                    <div class=\"_5v5d fcg\">\n" +
            "                        <div class=\"_2so _2sq _2ss img _50cg\" data-animtype=\"1\" data-sigil=\"m-loading-indicator-animate m-loading-indicator-root\"></div>Loading...\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"viewportArea aclb\" id=\"mErrorView\" style=\"display:none\" data-sigil=\"marea\">\n" +
            "                    <div class=\"container\">\n" +
            "                        <div class=\"image\"></div>\n" +
            "                        <div class=\"message\" data-sigil=\"error-message\"></div>\n" +
            "                        <a class=\"link\" data-sigil=\"MPageError:retry\">Try Again</a>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div id=\"static_templates\">\n" +
            "            <div class=\"mDialog\" id=\"modalDialog\" style=\"display:none\">\n" +
            "                <div class=\"_52z5 _451a mFuturePageHeader _1uh1 firstStep titled\" id=\"mDialogHeader\">\n" +
            "                    <div class=\"_4g33 _52we\">\n" +
            "                        <div class=\"_5s61\">\n" +
            "                            <div class=\"_52z7\">\n" +
            "                                <button type=\"submit\" value=\"Cancel\" class=\"cancelButton btn btnD bgb mfss touchable\" data-sigil=\"dialog-cancel-button blocking-touchable\">Cancel</button>\n" +
            "                                <button type=\"submit\" value=\"Back\" class=\"backButton btn btnI bgb mfss touchable iconOnly\" aria-label=\"Back\" data-sigil=\"dialog-back-button blocking-touchable\">\n" +
            "                                    <i class=\"img sp_C6RTKCRxMP6 sx_86b57a\" style=\"margin-top: 2px;\"></i>\n" +
            "                                </button>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"_4g34\">\n" +
            "                            <div class=\"_52z6\">\n" +
            "                                <div class=\"_50l4 mfsl fcw\" id=\"m-future-page-header-title\" data-sigil=\"m-dialog-header-title dialog-title\">Loading...</div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"_5s61\">\n" +
            "                            <div class=\"_52z8\" id=\"modalDialogHeaderButtons\"></div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    <div id=\"pagelet_0_1\"></div>\n" +
            "                </div>\n" +
            "                <div class=\"modalDialogView\" id=\"modalDialogView\"></div>\n" +
            "                <div class=\"_5v5d _5v5e fcg\" id=\"dialogSpinner\">\n" +
            "                    <div class=\"_2so _2sq _2ss img _50cg\" data-animtype=\"1\" id=\"u_0_7\" data-sigil=\"m-loading-indicator-animate m-loading-indicator-root\"></div>Loading...\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <script type=\"text/javascript\">/*\n" +
            "            <![CDATA[*/(function(){function si_cj(m){setTimeout(function(){new Image().src=\"https:\\/\\/error.facebook.com\\/common\\/scribe_endpoint.php?c=si_clickjacking&t=7673\"+\"&m=\"+m;},5000);}if(top!=self && !false){try{if(parent!=top){throw 1;}var si_cj_d=[\"apps.facebook.com\",\"apps.beta.facebook.com\"];var href=top.location.href.toLowerCase();for(var i=0;i<si_cj_d.length;i++){if (href.indexOf(si_cj_d[i])>=0){throw 1;}}si_cj(\"3 \");}catch(e){si_cj(\"1 \\t\");window.document.write(\"\\u003Cstyle>body * {display:none !important;}\\u003C\\/style>\\u003Ca href=\\\"#\\\" onclick=\\\"top.location.href=window.location.href\\\" style=\\\"display:block !important;padding:10px\\\">Go to Facebook.com\\u003C\\/a>\");/*ZYmIjDxr*/}}}())/*]]>*/\n" +
            "        </script>\n" +
            "        <script id=\"u_0_c\">require(\"TimeSlice\").guard(function() {(require(\"ServerJSDefine\")).handleDefines([[\"ErrorDebugHooks\",[],{\"SnapShotHook\":null},185],[\"MJSEnvironment\",[],{\"IS_APPLE_WEBKIT_IOS\":false,\"IS_TABLET\":false,\"IS_ANDROID\":false,\"IS_CHROME\":true,\"IS_FIREFOX\":false,\"IS_WINDOWS_PHONE\":false,\"OS_VERSION\":0,\"PIXEL_RATIO\":1,\"BROWSER_NAME\":\"Chrome Desktop\"},46],[\"MWebStorageMonsterWhiteList\",[],{\"whitelist\":[\"^Banzai$\",\"^bz\",\"^mutex\",\"^msys\",\"^sp_pi$\",\"^\\\\:userchooser\\\\:osessusers$\",\"^\\\\:userchooser\\\\:settings$\",\"^[0-9]+:powereditor:\",\"^Bandicoot\\\\:\",\"^brands\\\\:console\\\\:config$\",\"^CacheStorageVersion$\",\"^consoleEnabled$\",\"^jt$\",\"^_video_$\",\"^vc_\",\"^_showMDevConsole$\",\"^third_party_app_access_token$\"]},254],[\"CurrentUserInitialData\",[],{\"USER_ID\":\"0\",\"ACCOUNT_ID\":\"0\"},270],[\"MRequestConfig\",[],{\"dtsg\":{\"token\":\"AQEHZAqw5sHj:AQHkkSqQW1eG\",\"valid_for\":86400,\"expire\":1485600691},\"lsd\":\"AVrSsxEH\",\"checkResponseOrigin\":true,\"checkResponseToken\":true,\"ajaxResponseToken\":{\"secret\":\"GoZyXcc-YwFu8BtyNPbltxwUifL1x4uh\",\"encrypted\":\"AYksdk_U4lSP4S-YASgvhPKMHYV3IXTDLkWNhfLQQp4VSLCqxNyC6MaU1ppZDiAuRR53E0_PK6LF0kG7JLZhAPxsipjOfjkPy_HQWHDN6tt5pw\"}},51],[\"CurrentCommunityInitialData\",[],{},490],[\"ResourceWatcher\",[],{\"module\":null},1404],[\"MPageletUtilities\",[],{},358],[\"ZeroRewriteRules\",[],{\"rewrite_rules\":{},\"whitelist\":{\"\\/hr\\/r\":1,\"\\/zero\\/unsupported_browser\\/\":1,\"\\/zero\\/policy\\/optin\":1,\"\\/zero\\/optin\\/write\\/\":1,\"\\/zero\\/optin\\/legal\\/\":1,\"\\/zero\\/optin\\/free\\/\":1,\"\\/zero\\/toggle\\/welcome\\/\":1,\"\\/work\\/landing\":1,\"\\/work\\/login\\/\":1,\"\\/work\\/email\\/\":1,\"\\/ai.php\":1,\"\\/js_dialog_resources\\/dialog_descriptions_android.json\":1,\"\\/connect\\/jsdialog\\/MPlatformAppInvitesJSDialog\\/\":1,\"\\/connect\\/jsdialog\\/MPlatformOAuthShimJSDialog\\/\":1,\"\\/connect\\/jsdialog\\/MPlatformLikeJSDialog\\/\":1,\"\\/qp\\/interstitial\\/\":1,\"\\/qp\\/action\\/redirect\\/\":1,\"\\/qp\\/action\\/close\\/\":1,\"\\/zero\\/support\\/ineligible\\/\":1,\"\\/zero_balance_redirect\\/\":1,\"\\/zero_balance_redirect\":1,\"\\/l.php\":1,\"\\/lsr.php\":1,\"\\/ajax\\/dtsg\\/\":1,\"\\/checkpoint\\/block\\/\":1,\"\\/exitdsite\":1,\"\\/zero\\/balance\\/pixel\\/\":1,\"\\/zero\\/balance\\/\":1,\"\\/zero\\/balance\\/carrier_landing\\/\":1,\"\\/tr\":1,\"\\/tr\\/\":1,\"\\/sem_campaigns\\/sem_pixel_test\\/\":1}},1478],[\"ZeroCategoryHeader\",[],{},1127],[\"MBanzaiConfig\",[],{\"EXPIRY\":86400000,\"MAX_SIZE\":10000,\"MAX_WAIT\":30000,\"RESTORE_WAIT\":30000,\"gks\":{\"boosted_component\":true,\"mchannel_jumpstart\":true,\"platform_oauth_client_events\":true,\"timeline_year_of_life_overviews\":true,\"timeline_year_of_life_overviews_hscroll\":true,\"visibility_tracking\":true,\"boosted_pagelikes\":true,\"gqls_web_logging\":true},\"blacklist\":[\"time_spent\"]},32],[\"MSession\",[],{\"useAngora\":false,\"logoutURL\":\"\\/logout.php?h=AfexwtSlSTP9Rh9g&t=1485514291\",\"push_phase\":\"V3\"},52],[\"ServiceWorkerBackgroundSyncGK\",[],{\"background_sync_sw\":false},1628],[\"ReactGK\",[],{\"logTopLevelRenders\":false,\"domIsFiber\":false,\"domIsFiberInUFI\":false,\"prepareNewChildrenBeforeUnmountInStack\":true},998],[\"ServerNonce\",[],{\"ServerNonce\":\"_cvYmnu-nLPCvqwrATFUbp\"},141],[\"TimeSliceInteractionCoinflips\",[],{\"default_rate\":1000,\"interaction_to_coinflip\":{\"async_request\":1,\"video_psr\":1,\"snowlift_open_autoclosed\":0,\"Event\":100000,\"cms_editor\":1},\"enable_heartbeat\":true},1799],[\"ServiceWorkerBackgroundSyncBanzaiGK\",[],{\"sw_background_sync_banzai\":false},1621],[\"CoreWarningGK\",[],{\"forceWarning\":false},725],[\"SiteData\",[],{\"revision\":2799609,\"tier\":\"\",\"push_phase\":\"V3\",\"pkg_cohort\":\"FW_EXP:mtouch_pkg\",\"pkg_cohort_key\":\"__pc\",\"haste_site\":\"mobile\",\"be_mode\":-1,\"be_key\":\"__be\",\"is_rtl\":false,\"features\":\"i0\",\"vip\":\"31.13.93.36\"},317],[\"ArtilleryExperiments\",[],{\"artillery_timeslice_edges\":false,\"artillery_static_resources_pagelet_attribution\":false,\"artillery_timeslice_compressed_data\":false,\"artillery_miny_client_payload\":false},1237],[\"FbtLogger\",[],{\"logger\":null},288],[\"FbtResultGK\",[],{\"shouldReturnFbtResult\":true,\"inlineMode\":\"NO_INLINE\"},876],[\"IntlViewerContext\",[],{\"GENDER\":50331648},772],[\"IntlPhonologicalRules\",[],{\"meta\":{\"\\/_B\\/\":\"([.,!?\\\\s]|^)\",\"\\/_E\\/\":\"([.,!?\\\\s]|$)\"},\"patterns\":{\"\\/\\u0001(.*)('|&#039;)s\\u0001(?:'|&#039;)s(.*)\\/\":\"\\u0001$1$2s\\u0001$3\",\"\\/_\\u0001([^\\u0001]*)\\u0001\\/\":\"javascript\"}},1496],[\"UserAgentData\",[],{\"browserArchitecture\":\"64\",\"browserFullVersion\":\"55.0.2883.87\",\"browserMinorVersion\":0,\"browserName\":\"Chrome\",\"browserVersion\":55,\"deviceName\":\"Unknown\",\"engineName\":\"WebKit\",\"engineVersion\":\"537.36\",\"platformArchitecture\":\"64\",\"platformName\":\"Linux\",\"platformVersion\":null,\"platformFullVersion\":null},527],[\"MLoadingIndicatorSigils\",[],{\"ANIMATE\":\"m-loading-indicator-animate\",\"ROOT\":\"m-loading-indicator-root\"},279],[\"FWLoader\",[],{},278],[\"MPageControllerGating\",[],{\"shouldDeferUntilCertainNoRedirect\":false},2023],[\"JSErrorExtra\",[],{},251],[\"JSErrorPlatformColumns\",[],{},255],[\"MRenderingSchedulerConfig\",[],{\"delayNormalResources\":false},1978],[\"FbtQTOverrides\",[],{\"overrides\":{\"1_5f82098f4e1fdef32427b672e4eb3f85\":\"Try a Form to Find More Customers\",\"1_aea634284453b2999fb91d742371e1ec\":\"Create a form that opens instantly from your ad and is prefilled with info that people have already given to Facebook.\",\"1_65c3391ebe4a1af8364ca4fbb8cb54d1\":\"Mobile Number or Email:\",\"1_9171ad6e2268759887b1b45d16139587\":\"Reach Even More People\",\"1_a062f489af17feff21bd65b765245aa0\":\"Name or email\"}},551]]);new (require(\"ServerJS\"))().setServerFeatures(\"i0\").handle({});}, \"ServerJS define\", {\"root\":true})();(require(\"Bootloader\")._pickupPageResources || function(){})();require(\"MCoreInit\").init({\"clearMCache\":false,\"deferredResources\":[\"FYGON\",\"4oCaF\",\"q5jxB\",\"V39Bp\",\"sRipl\",\"XPAok\"],\"hideLocationBar\":true,\"onafterload\":\"\",\"onload\":\"\",\"serverJSData\":{\"instances\":[[\"__inst_00515a1b_0_0\",[\"MPlatformDialog\",\"__elem_242e8bd2_0_0\"],[{\"__m\":\"__elem_242e8bd2_0_0\"},false],1]],\"elements\":[[\"__elem_4c5b2d31_0_0\",\"u_0_0\",1],[\"__elem_242e8bd2_0_0\",\"platformDialogForm\",1],[\"__elem_eed16c0a_0_0\",\"u_0_2\",1],[\"__elem_a32d506f_0_0\",\"u_0_3\",1],[\"__elem_a32d506f_0_1\",\"u_0_4\",1],[\"__elem_a588f507_0_0\",\"u_0_5\",1],[\"__elem_a588f507_0_1\",\"u_0_6\",1]],\"require\":[[\"MPlatformDialogMSite\",\"button\",[],[\"__CANCEL__\",\"Cancel\"],[]],[\"MPlatformDialogMSite\",\"button\",[],[\"__CONFIRM__\",\"Send\"],[]],[\"MScrollPositionSaver\"],[\"MPageHeaderAccessibility\"],[\"MBlockingTouchable\"],[\"MShareAudienceSelector\",\"listenToModeChangeForSubmitButton\",[\"__elem_4c5b2d31_0_0\"],[{\"__m\":\"__elem_4c5b2d31_0_0\"}],[]],[\"__inst_00515a1b_0_0\"],[\"LoadingIndicator\",\"init\",[\"__elem_eed16c0a_0_0\",\"__elem_a588f507_0_0\",\"__elem_a588f507_0_1\"],[{\"__m\":\"__elem_eed16c0a_0_0\"},{\"__m\":\"__elem_a588f507_0_0\"},{\"__m\":\"__elem_a588f507_0_1\"}],[]],[\"MPageError\"],[\"ControlledReferer\"],[\"ControlledReferer\",\"useFacebookRefererHtml\",[\"__elem_a32d506f_0_0\"],[{\"__m\":\"__elem_a32d506f_0_0\"},\"\\u003Cform method=\\\"get\\\" action=\\\"https:\\/\\/m.facebook.com\\/sem_campaigns\\/sem_pixel_test\\/\\\" id=\\\"theform\\\">\\u003Cinput name=\\\"google_pixel_category\\\" value=\\\"1\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"google_pixel_src\\\" value=\\\"https:\\/\\/googleads.g.doubleclick.net\\/pagead\\/viewthroughconversion\\/995153884\\/?value=1.00&amp;currency_code=USD&amp;label=OfKoCPXz2VwQ3K_D2gM&amp;guid=ON&amp;script=0\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"encoded_one\\\" value=\\\"AQTGIMiBR04fqb-RWtYheKPnD7Kywz1U2C7uNfjL2zIar66sS3z9bKXJRjT6ccxLH34tdxRsdLRhJxwoZWV0uuov\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"encoded_two\\\" value=\\\"AQQhNR8yd_AC5HHdzFnBMFIIIvfqNAEZ7UWw_Oo7NL8khmGpLIAUFgKjv5bAy4Wx9X7CvorZ_v2PlaA6uRb94Iea\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003C\\/form>\\u003Ciframe frameborder=\\\"0\\\" width=\\\"1\\\" height=\\\"1\\\" onload=\\\"document.getElementById(&#039;theform&#039;).submit()\\\">\\u003C\\/iframe>\"],[]],[\"ControlledReferer\",\"useFacebookRefererHtml\",[\"__elem_a32d506f_0_1\"],[{\"__m\":\"__elem_a32d506f_0_1\"},\"\\u003Cform method=\\\"get\\\" action=\\\"https:\\/\\/googleads.g.doubleclick.net\\/pagead\\/viewthroughconversion\\/995153884\\/\\\" id=\\\"theform\\\">\\u003Cinput name=\\\"value\\\" value=\\\"1.00\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"currency_code\\\" value=\\\"USD\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"label\\\" value=\\\"OfKoCPXz2VwQ3K_D2gM\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"guid\\\" value=\\\"ON\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003Cinput name=\\\"script\\\" value=\\\"0\\\" type=\\\"hidden\\\" autocomplete=\\\"off\\\" \\/>\\u003C\\/form>\\u003Ciframe frameborder=\\\"0\\\" width=\\\"1\\\" height=\\\"1\\\" onload=\\\"document.getElementById(&#039;theform&#039;).submit()\\\">\\u003C\\/iframe>\"],[]],[\"ErrorUtils\"],[\"MLogger\"],[\"MExceptionHandler\"],[\"LogHistoryListeners\"],[\"ScriptPath\",\"set\",[],[\"\\/v2.2\\/dialog\\/app_requests:touch\",\"a1f3c513\",{\"imp_id\":\"b20009a8\"}],[]],[\"MLogging\",\"main\",[],[{\"refid\":0}],[]],[\"FW\",\"callNative\",[],[[{\"method\":\"loadCompleted\"}],true],[]],[\"MModalDialogInit\"],[\"MLoadingIndicator\",\"init\",[],[\"u_0_7\"],[]],[\"MPrelude\"],[\"NavigationMetrics\"],[\"PerfXLogger\"]]},\"isWildeWeb\":false,\"isFacewebAndroid\":false,\"ixData\":{},\"bootloadable\":{\"Banzai\":{\"resources\":[\"4oCaF\"],\"module\":1},\"ResourceTimingBootloaderHelper\":{\"resources\":[\"h04LL\",\"V39Bp\",\"Th6\\/H\"],\"module\":1},\"TimeSliceHelper\":{\"resources\":[\"2oqnd\",\"4oCaF\",\"V39Bp\",\"h04LL\"],\"module\":1}},\"resource_map\":{\"h04LL\":{\"type\":\"js\",\"src\":\"https:\\/\\/static.xx.fbcdn.net\\/rsrc.php\\/v3\\/y6\\/r\\/fN8TpG0yiNb.js\"},\"V39Bp\":{\"type\":\"js\",\"src\":\"https:\\/\\/static.xx.fbcdn.net\\/rsrc.php\\/v3i55F4\\/yT\\/l\\/en_US\\/oLsPM8mp-Bu.js\"},\"Th6\\/H\":{\"type\":\"js\",\"src\":\"https:\\/\\/static.xx.fbcdn.net\\/rsrc.php\\/v3iNrx4\\/yt\\/l\\/en_US\\/drWhX261PZQ.js\"},\"2oqnd\":{\"type\":\"js\",\"src\":\"https:\\/\\/static.xx.fbcdn.net\\/rsrc.php\\/v3if3Y4\\/yV\\/l\\/en_US\\/Ll1koqCibwV.js\"},\"q5jxB\":{\"type\":\"js\",\"src\":\"https:\\/\\/static.xx.fbcdn.net\\/rsrc.php\\/v3icuM4\\/yO\\/l\\/en_US\\/nsaYV8m1qQ-.js\"},\"XPAok\":{\"type\":\"js\",\"src\":\"https:\\/\\/static.xx.fbcdn.net\\/rsrc.php\\/v3\\/yV\\/r\\/YGCMYV_CBaR.js\"}}});</script>\n" +
            "    <script id=\"u_0_d\">require(\"TimeSlice\").guard(function() {(require(\"ServerJSDefine\")).handleDefines([]);new (require(\"ServerJS\"))().setServerFeatures(\"i0\").handle({\"require\":[[\"MRenderingScheduler\",\"satisfyDependency\",[],[\"tti_ready\"],[]],[\"MCoreInit\",\"satisfyDependency\",[],[\"tti_ready\"],[]]]});}, \"ServerJS define\", {\"root\":true})();</script>\n" +
            "    <script id=\"u_0_e\">require(\"MRenderingScheduler\").preArrive({\"name\":\"pagelet_0_0\",\"serverlid\":\"6380235299010043253\"})</script>\n" +
            "    <script id=\"u_0_f\">require(\"MRenderingScheduler\").getInstance().schedule({\"id\":\"pagelet_0_0\",\"pageletConfig\":{\"lid\":\"6380235299010043253-60001\",\"serverlid\":\"6380235299010043253\",\"name\":\"pagelet_0_0\",\"pass\":4,\"serverJSData\":{},\"onload\":\"\",\"onafterload\":\"\",\"scheduledMarkupIndex\":0,\"templateContainer\":\"static_templates\",\"templates\":{\"__html\":\"\"},\"ixData\":{},\"resource_map\":{},\"bootloadable\":{},\"type\":\"chrome\"},\"displayResources\":[],\"normalResources\":[],\"content\":{\"__html\":\"\"}}, function() {require(\"NavigationMetrics\").postPagelet(false, \"6380235299010043253\");});</script>\n" +
            "    <script id=\"u_0_g\">require(\"MRenderingScheduler\").preArrive({\"name\":\"pagelet_0_1\",\"serverlid\":\"6380235299010043253\"})</script>\n" +
            "    <script id=\"u_0_h\">require(\"MRenderingScheduler\").getInstance().schedule({\"id\":\"pagelet_0_1\",\"pageletConfig\":{\"lid\":\"6380235299010043253-60001\",\"serverlid\":\"6380235299010043253\",\"name\":\"pagelet_0_1\",\"pass\":4,\"serverJSData\":{},\"onload\":\"\",\"onafterload\":\"\",\"scheduledMarkupIndex\":1,\"templateContainer\":\"static_templates\",\"templates\":{\"__html\":\"\"},\"ixData\":{},\"resource_map\":{},\"bootloadable\":{},\"type\":\"chrome\"},\"displayResources\":[],\"normalResources\":[],\"content\":{\"__html\":\"\"}}, function() {require(\"NavigationMetrics\").postPagelet(false, \"6380235299010043253\");});</script>\n" +
            "    <script id=\"u_0_j\">require(\"Bootloader\").setResourceMap({});</script>\n" +
            "    <script id=\"u_0_i\">require(\"MRenderingScheduler\").getInstance().setPageletCount(2);require(\"NavigationMetrics\").setPage({\"page\":\"\\/v2.2\\/dialog\\/app_requests:touch\",\"page_type\":\"normal\",\"page_uri\":\"https:\\/\\/m.facebook.com\\/v2.2\\/dialog\\/apprequests?access_token=EAAC5a2fuVEcBAH9SQkhO5kaNBZA5lv84qOrpCm4wawDOEOXUZBUROCjCOGuFsYpaEeCoSr6JQKNxMU7DlJUXFd908WWmwqA3IQnMqyA5binL39WtHrvknWNMz7qpuFW0T33S20MEjZBT8M30BZCcBGBhHG2uK0La1AxIk9H32AN1x9aBjLG89d1ixI5neqlsSd33pdxCszumZB5tz9ZBto&app_id=203870956311623&to=357690514616658\\u00252c131514350689929&type=user_agent&title=SampleApp&redirect_uri=fbconnect\\u00253A\\u00252F\\u00252Fsuccess&message=Join\\u002520me\\u002520on\\u002520SampleApp!&display=touch\",\"serverLID\":\"6380235299010043253\"});require(\"TimeSlice\").guard(function() {(require(\"ServerJSDefine\")).handleDefines([]);new (require(\"ServerJS\"))().setServerFeatures(\"i0\").handle({});}, \"ServerJS define\", {\"root\":true})();(function() {require(\"MRenderingScheduler\").getInstance().addPostSchedulerFunction(function() {require(\"NavigationMetrics\").postScheduler(\"\\/v2.2\\/dialog\\/app_requests:touch\", \"normal\");});})();</script>\n" +
            "</body>\n" +
            "</html>";

    public static String getData() {
        return data;
    }

}
