package com.microsoft.mysearch.qa.xpathbuilder;

import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static com.microsoft.mysearch.qa.util.xpathbuilder.IXPath.*;

public class XPathBuilderTest {

    private static final Log log=LogFactory.getLog(XPathBuilderTest.class.getName());

    @Test
    public void test0() throws Exception {

        String xpath=getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "dialog titlebar close") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "close");
        System.out.println("$x(\"" + xpath + "\")");

    }

    @Test
    public void test1() {

        String

        ORIG_ELECTRON_APP_HANDLER_XPATH="//body",
        ORIG_CHANNEL_LOADING_SPINNER_XPATH="//div[contains(@class,'app-loading')]",
        ORIG_CHANNEL_MESSAGE_LIST_XPATH="//virtual-repeat[contains(@class,'ts-message-list')]",
        ORIG_SPACES_LOGIN_USE_ANOTHER_ACCOUNT_ID="use_another_account",
        ORIG_SPACES_LOGIN_USERNAME_ID="cred_userid_inputtext",
        ORIG_SPACES_LOGIN_PASSWORD_ID="cred_password_inputtext",
        ORIG_SPACES_LOGIN_SUBMIT_ID="cred_sign_in_button",
        ORIG_SPACES_USER_INFO_ELEM_XPATH="//div[@data-tid='userInformation']",
        ORIG_SPACES_OPTIONS_DROPDOWN_BUTTON_ID="personDropdown",
        ORIG_SPACES_OPTIONS_DROPDOWN_BUTTON_XPATH="//footer/button[@id='personDropdown']",
        ORIG_SPACES_LOGOUT_BUTTON_ID="logout-button",
        ORIG_CALLING_NOT_SUPPORTED_MESG="This feature is coming and will be available real soon",
        ORIG_SYNC_FAIL_MSG="Failed to sync content. Please refresh to try again.",
        ORIG_ACCESS_CONTENT_FAIL_MSG="We cannot access your content. Please refrest to try again.",
        ORIG_MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH="//p[.='Sign in with a username and password instead']",
        ORIG_MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH_MORE_ACCURATE="//p[text()='Sign in with a username and password instead']",
        ORIG_MSFT_LOGIN_PASSWORD_ID="passwordInput",
        ORIG_MSFT_LOGIN_BUTTON_ID="submitButton",
        ORIG_SHOW_MORE_TEAMS_BUTTON_XPATH="//a[@data-tid='team-overflow-moreBtn']",
        ORIG_CALL_NOTIFICATION_WINDOW_XPATH="//div[contains(@class,'notification')]",
        ORIG_CALL_NOTIFICATION_WINDOW_IS_CALLING_MESG_XPATH="//div[contains(@class,'subtitle')][contains(text(),'is calling you')]",
        ORIG_CALL_NOTIFICATION_WINDOW_IS_NUDGING_MESG_XPATH="//div[contains(@class,'subtitle')][contains(text(),'wants you to join a meeting')]",
        ORIG_CALL_NOTIFICATION_ACCEPT_CALL_VIDEO_BUTTON_XPATH="//div[contains(@class,'call-video')]",
        ORIG_CALL_NOTIFICATION_ACCEPT_CALL_AUDIO_BUTTON_XPATH="//div[contains(@class,'call-audio')]",
        ORIG_CALL_NOTIFICATION_REJECT_CALL_BUTTON_XPATH="//div[contains(@class,'call-reject')]",
        ORIG_CALL_NOTIFICATION_JUMP_IN_CALL_BUTTON_XPATH="//div[contains(@class,'jumpin')]",
        ORIG_CALL_NOTIFICATION_CHAT_CALL_BUTTON_XPATH="//div[contains(@class,'chat')]",
        ORIG_CHAT_SEARCH_INPUT_XPATH="//div[@data-tid='left-rail-2']//input[@id='searchInput']",
        ORIG_CHAT_SEARCH_BUTTON_XPATH="//div[@data-tid='left-rail-2']//button[@data-tid='searchBtn']",
        ORIG_CHAT_CREATE_CHAT_BTN_XPATH="//button[@data-tid='lr-create-chat-2']",
        ORIG_CHAT_SEARCH_PEOPLE_TAB_XPATH="//search//span[.='People']",
        ORIG_CHAT_LINK_XPATH_TEMPLATE="//individual-search-category-people//div/div[.='%s']/..",
        ORIG_CHAT_USERNAME_HEADER_XPATH_TEMPLATE="//chat-header//*[@pl-upn='%s']",
        ORIG_CHAT_VIDEO_CALL_START_BUTTON_XPATH="//calling-start-button[@with-video='true']/button",
        ORIG_CHAT_AUDIO_CALL_START_BUTTON_XPATH="//calling-start-button[not(@with-video) or @with-video='false']/button",
        ORIG_CHAT_VIDEO_CALL_JOIN_BUTTON_XPATH="//calling-join-button[not(@audio-only) or @audio-only='false']/button",
        ORIG_CHAT_AUDIO_CALL_JOIN_BUTTON_XPATH="//calling-join-button[@audio-only='true']/button",
        ORIG_CHAT_VIDEO_CALL_REJECT_BUTTON_XPATH="//calling-reject-button/button",
        ORIG_CALL_1_1_PARTICIPANT_ANIMATION_XPATH_TEMPLATE="//calling-animation-outgoing//img[@pl-upn='%s']",
        ORIG_CALL_1_1_JOIN_ERROR_STATE_XPATH="//div[contains(@class,'state-description-title')]",
        ORIG_CHAT_ADD_PARTICIPANT_BUTTON_XPATH="//chat-header//button[@data-tid='lr-create-group-chat']",
        ORIG_CHAT_PEOPLE_PICKER_INPUT_XPATH="//div[@data-tid='createNewChat']//chat-people-picker//input",
        ORIG_CHAT_CREATE_NEW_INPUT_XPATH="//chat-people-picker[@data-tid='mp-to-line']//input",
        ORIG_CHAT_USER_CHOOSER_XPATH="//div[@data-tid='peoplepicker-dropdown']//div[contains(@class,'result-image')]",
        ORIG_CHAT_ADD_USER_BUTTON_XPATH="//div[@data-tid='createNewChat']//button[@data-tid='createChat-AddMembers']",
        ORIG_CHAT_GROUP_HEADER_XPATH_TEMPLATE="//chat-header//span[@pl-upn='%s']",
        ORIG_CHAT_RECENTS_ACTIVE_CALL_XPATH="//div[@data-tid='left-rail-2']//active-calls-counter/span",
        ORIG_CHANNEL_CONVERSATION_URL_TEMPLATE="channel/%(team_name)s/%(channel_name)s/%(channel_thread_id)s/conversations?ctx=channel",
        ORIG_CHANNEL_CONVERSATION_TITLE_TEMPLATE="//h2[@data-tid='messagesHeader-Title' and .='%s']",
        ORIG_CHANNEL_CONVERSATION_CALL_START_BUTTON_XPATH="//div[@data-tid='messageEditor']//button[contains(@class,'icons-call')]",
        ORIG_CHANNEL_CONVERSATION_CALL_TITLE_INPUT_XPATH="//div[contains(@class,'title-container')]/input[contains(@class,'title')]",
        ORIG_CHANNEL_CONVERSATION_NEW_CALL_START_BUTTON_XPATH="//calling-start-button-rectangular/button",
        ORIG_CHANNEL_CONVERSATION_JUMP_IN_BUTTON_MOST_RECENT_XPATH="//calling-th87read-header//calling-join-button[last()]/button",
        ORIG_CHANNEL_CONVERSATION_JUMP_IN_BUTTON_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE="//calling-thread-header//calling-live-roster/div/img[@pl-upn='%s']/../../../../calling-join-button/button",
        ORIG_CHANNEL_CONVERSATION_MEETUP_TITLE_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE="//calling-thread-header//calling-live-roster/div/img[@pl-upn='%s']/../../../div/div[contains(@class,'title')]",
        ORIG_CHANNEL_PERSISTENT_INDICATOR_JUMP_IN_BUTTON_XPATH="//calling-persistent-indicator//div[contains(@title,'%s')]/../..//calling-join-button/button",
        ORIG_CHANNEL_CONVERSATION_AVATAR_IN_CALLING_HEADER_ROSTER_XPATH_TEMPLATE="//calling-thread-header//calling-live-roster/div/img[@pl-upn='%s']/../img[@pl-upn]",
        ORIG_CHANNEL_CONVERSATION_CALL_MONITOR_XPATH="//calling-monitor/div[contains(@class,'ts-show-cursor')]",
        ORIG_CHANNEL_CONVERSATION_MEETUP_ENDED_XPATH_TEMPLATE="(//div[contains(@class,'ts-message-list-item')]//img[@pl-upn='%s'])[last()]/../../../div[contains(.,'%s')]",
        ORIG_CHANNEL_CONVERSATION_MEETUP_ENDED_MESG="ended:",
        ORIG_CHANNEL_PERSISTENT_INDICATOR_MORE_BUTTON_XPATH="//calling-persistent-indicator//a[contains(@class,'toggle-button')]",
        ORIG_CALLING_SCREEN_XPATH="//calling-screen",
        ORIG_CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_TEMPLATE="//calling-participant-stream//img[@pl-upn='%s']",
        ORIG_CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_TEMPLATE="//calling-stage//calling-participant-stream//img[@pl-upn='%s']",
        ORIG_CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_ENTRY="//calling-participant-stream//img[@pl-upn]",
        ORIG_CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_ENTRY="//calling-stage//calling-participant-stream//img[@pl-upn]",
        ORIG_CALLING_SCREEN_PARTICIPANT_SHARING_SCREEN_AVATAR_XPATH_TEMPLATE="//div[contains(@class,'PRESENTATION')]//calling-stage//calling-participant-stream//img[@pl-upn='%s']",
        ORIG_CALLING_SCREEN_SHARE_DESKTOP_PANEL_XPATH="//div[contains(@class,'ts-calling-screensharing-panel')]",
        ORIG_CALLING_SCREEN_SHARE_DESKTOP_PANEL_SCREEN_XPATH="//div[contains(@class,'ts-calling-screensharing-panel')]//div[contains(@class,'screen')]",
        ORIG_CALLING_SCREEN_HANGUP_BUTTON_XPATH="//button[contains(@class,'ts-hangup')]",
        ORIG_CALLING_SCREEN_SHARE_DESKTOP_BUTTON_XPATH="//button[contains(@class,'share-desktop')]",
        ORIG_CALLING_SCREEN_PARTICIPANT_STREAM_XPATH="//calling-participant-stream",
        ORIG_CALLING_SCREEN_TOGGLE_VIDEO_BUTTON_XPATH="//button[contains(@title,'video')]",
        ORIG_CALLING_SCREEN_MEETUP_TITLE_XPATH="//editable-text//div[contains(@class,'title')]",
        ORIG_CALLING_SCREEN_MEETUP_TITLE_INPUT_XPATH="//editable-text//input",
        ORIG_CALLING_SCREEN_MEETUP_TITLE_SAVE_XPATH="//span[@title='Save title']",
        ORIG_CALLING_MYSELF_VIDEO_XPATH="//calling-myself-video//canvas[@width]",
        ORIG_CALLING_MYSELF_AVATAR_XPATH="//calling-myself-video/div[contains(@class,'audioOnly')]",
        ORIG_CALLING_SCREEN_TOGGLE_CHAT_ENABLED_XPATH="//button[not(@disabled) and contains(@class,'toggle-chat')]",
        ORIG_CALLING_SCREEN_ADD_PARTICIPANT_BUTTON_XPATH="//button[not(@disabled) and contains(@class,'toggle-roster')]",
        ORIG_CALLING_SCREEN_IN_CHAT_PANE_XPATH="//context-message-pane",
        ORIG_CALLING_SCREEN_MESSAGE_EDITOR_XPATH="//div[@data-tid='messageEditor']",
        ORIG_CALLING_SCREEN_MESSAGES_PANE_TEXT_XPATH_TEMPLATE="//div[@data-tid='messageBodyContent']//div[contains(text(),'%s')]",
        ORIG_CALLING_SCREEN_MESSAGE_INPUT_CSS=".ts-add-message .cke_contents div.cke_reset",
        ORIG_CALLING_SCREEN_ADD_PARTICIPANT_PANE_XPATH="//calling-roster",
        ORIG_CALLING_SCREEN_INVITE_INPUT_XPATH="//calling-roster-search//input[@id='searchInput']",
        ORIG_CALLING_SCREEN_SEARCH_RESULT_USER_XPATH_TEMPLATE="//calling-roster-search-results//img[@pl-upn='%s']",
        ORIG_CALLING_SCREEN_USER_CONNECTING_XPATH_TEMPLATE="//calling-roster-section//div[contains(@class,'roster_list_title')]/..//img[@pl-upn='%s']",
        ORIG_CHAT_LIST_XPATH="//chat-list",
        ORIG_CHANNEL_LIST_XPATH="//channel-list",
        ORIG_GENERAL_CHAT_FOR_1ST_TEAM="//channel-list//a[contains(@title,'General')]",
        ORIG_APP_BAR_CHAT_BUTTON_XPATH="//app-bar//button[@data-tid='app-bar-2']",
        ORIG_APP_BAR_TEAMS_BUTTON_XPATH="//app-bar//button[@data-tid='app-bar-3']",
        ORIG_CALLING_HEADER_MENU_XPATH="//calling-header//button[contains(@title,'Toggle sidebar')]",
        ORIG_LEFT_RAIL_USER_INFO_XPATH="//user-information/div[contains(@class,'app-user-information')]",
        ORIG_CALL_HANGING_UP_XPATH="//div[contains(@class,'call-state-layer')]",
        ORIG_FIND_ELEMENT_BY_XPATH_JS_TEMPLATE="var elem=document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;",
        ORIG_SCROLL_DOWN_ELEMENT_JS="elem.scrollTop=elem.scrollHeight;",
        ORIG_SCROLL_UP_ELEMENT_JS="elem.scrollTop=0;",
        ORIG_LOGOUT_EXE_ANGULAR_JS="angular.element(document.body).injector().get('authenticationService').logOut();",
        ORIG_CALL_HANGUP_EXE_ANGULAR_JS="angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stop();",
        ORIG_CALL_STOP_VIDEO_EXE_ANGULAR_JS="angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stopVideo();",
        ORIG_CALL_START_VIDEO_EXE_ANGULAR_JS="angular.element(document.body).injector().get('callingService').callRegistry.calls[0].startVideo();",
        ORIG_TOGGLE_CALLING_HEADER_MENU_JS="document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();",
        ORIG_TYPE_TEXT_TO_XPATH_ELEMENT_JS_TEMPLATE="document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='%s';";


        String
                ELECTRON_APP_HANDLER_XPATH=                                      getXPath(doubleSlash, body),
                CHANNEL_LOADING_SPINNER_XPATH=                                   getXPath(div, contains, class_att, "app-loading"),
                CHANNEL_MESSAGE_LIST_XPATH=                                      getXPath(virtualRepeat, contains, class_att, "ts-message-list"),
                SPACES_USER_INFO_ELEM_XPATH=                                     getXPath(div, equals, dataTid, "userInformation"),
                SPACES_OPTIONS_DROPDOWN_BUTTON_XPATH=                            getXPath(footer) + getXPath(singleSlash, button, equals, id, "personDropdown"),
                MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH=               getXPath(p, equals, any, "Sign in with a username and password instead"),
                MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH_MORE_ACCURATE= getXPath(p, equals, text, "Sign in with a username and password instead"),
                SHOW_MORE_TEAMS_BUTTON_XPATH=                                    getXPath(a, equals, dataTid, "team-overflow-moreBtn"),
                CALL_NOTIFICATION_WINDOW_XPATH=                                  getXPath(div, contains, class_att, "notification"),                                                                
                CALL_NOTIFICATION_WINDOW_IS_CALLING_MESG_XPATH=                  getXPath(div, contains, class_att, "subtitle") + getXPath(contains, text, "is calling you"),                        
                CALL_NOTIFICATION_WINDOW_IS_NUDGING_MESG_XPATH=                  getXPath(div, contains, class_att, "subtitle") + getXPath(contains, text, "wants you to join a meeting"),         
                CALL_NOTIFICATION_ACCEPT_CALL_VIDEO_BUTTON_XPATH=                getXPath(div, contains, class_att, "call-video"),
                CALL_NOTIFICATION_ACCEPT_CALL_AUDIO_BUTTON_XPATH=                getXPath(div, contains, class_att, "call-audio"),
                CALL_NOTIFICATION_REJECT_CALL_BUTTON_XPATH=                      getXPath(div, contains, class_att, "call-reject"),                                                                     
                CALL_NOTIFICATION_JUMP_IN_CALL_BUTTON_XPATH=                     getXPath(div, contains, class_att, "jumpin"),
                CALL_NOTIFICATION_CHAT_CALL_BUTTON_XPATH=                        getXPath(div, contains, class_att, "chat")                                                              /*"//div[contains(@class,'chat')]",*/,
                CHAT_SEARCH_INPUT_XPATH=                                         getXPath(div, equals, dataTid, "left-rail-2") + getXPath(input, equals, id, "searchInput"),       /*"//div[@data-tid='left-rail-2']//input[@id='searchInput']",*/
                CHAT_SEARCH_BUTTON_XPATH=                                        getXPath(div, equals, dataTid, "left-rail-2") + getXPath(button, equals, dataTid, "searchBtn"),   /*"//div[@data-tid='left-rail-2']//button[@data-tid='searchBtn']",*/
                CHAT_CREATE_CHAT_BTN_XPATH=                                      getXPath(button, equals, dataTid, "lr-create-chat-2"),                                                  /*"//button[@data-tid='lr-create-chat-2']",*/
                CHAT_SEARCH_PEOPLE_TAB_XPATH=                                    getXPath(search) + getXPath(span, equals, any, "People"),                                               /*"//search//span[.='People']",*/
                CHAT_LINK_XPATH_TEMPLATE=                                        getXPath(individual_search) + getXPath(div) + getXPath(singleSlash, div, equals, any, "%s") + "/..",    /*"//individual-search-category-people//div/div[.='%s']/..",*/
                CHAT_USERNAME_HEADER_XPATH_TEMPLATE=                             getXPath(chat_header) + getXPath(any_element, equals, pl_upn, "%s"),                                    /*"//chat-header//*[@pl-upn='%s']",*/
                CHAT_VIDEO_CALL_START_BUTTON_XPATH=                              getXPath(call_start_btn, equals, with_video, "true") + getXPath(singleSlash, button),                   /*"//calling-start-button[@with-video='true']/button",*/
                CHAT_AUDIO_CALL_START_BUTTON_XPATH=                              getXPath(call_start_btn),/*"//calling-start-button[not(@with-video) or @with-video='false']/button",*/

                CHAT_VIDEO_CALL_JOIN_BUTTON_XPATH=                              getXPath(call_join_btn, ACTIONS.NOT_ATTRIBUTE_WITHOUT_VALUE, audio_only),/*"//calling-join-button[not(@audio-only) or @audio-only='false']/button",*/

                CHAT_AUDIO_CALL_JOIN_BUTTON_XPATH=                              getXPath(call_join_btn, equals, audio_only, "true") + getXPath(singleSlash, button), /*"//calling-join-button[@audio-only='true']/button",*/
                CHAT_VIDEO_CALL_REJECT_BUTTON_XPATH=                            getXPath("calling-reject-button") + getXPath(singleSlash, button),/*"//calling-reject-button/button",*/
                CALL_1_1_PARTICIPANT_ANIMATION_XPATH_TEMPLATE=                  getXPath("calling-animation-outgoing") + getXPath("img", equals, pl_upn, "%s"),/*"//calling-animation-outgoing//img[@pl-upn='%s']",*/
                CALL_1_1_JOIN_ERROR_STATE_XPATH="//div[contains(@class,'state-description-title')]",
                CHAT_ADD_PARTICIPANT_BUTTON_XPATH="//chat-header//button[@data-tid='lr-create-group-chat']",
                CHAT_PEOPLE_PICKER_INPUT_XPATH="//div[@data-tid='createNewChat']//chat-people-picker//input",
                CHAT_CREATE_NEW_INPUT_XPATH="//chat-people-picker[@data-tid='mp-to-line']//input",
                CHAT_USER_CHOOSER_XPATH="//div[@data-tid='peoplepicker-dropdown']//div[contains(@class,'result-image')]",
                CHAT_ADD_USER_BUTTON_XPATH="//div[@data-tid='createNewChat']//button[@data-tid='createChat-AddMembers']",
                CHAT_GROUP_HEADER_XPATH_TEMPLATE="//chat-header//span[@pl-upn='%s']",
                CHAT_RECENTS_ACTIVE_CALL_XPATH="//div[@data-tid='left-rail-2']//active-calls-counter/span",
                CHANNEL_CONVERSATION_URL_TEMPLATE="channel/%(team_name)s/%(channel_name)s/%(channel_thread_id)s/conversations?ctx=channel",
                CHANNEL_CONVERSATION_TITLE_TEMPLATE="//h2[@data-tid='messagesHeader-Title' and .='%s']",
                CHANNEL_CONVERSATION_CALL_START_BUTTON_XPATH="//div[@data-tid='messageEditor']//button[contains(@class,'icons-call')]",
                CHANNEL_CONVERSATION_CALL_TITLE_INPUT_XPATH="//div[contains(@class,'title-container')]/input[contains(@class,'title')]",
                CHANNEL_CONVERSATION_NEW_CALL_START_BUTTON_XPATH="//calling-start-button-rectangular/button",
                CHANNEL_CONVERSATION_JUMP_IN_BUTTON_MOST_RECENT_XPATH="//calling-thread-header//calling-join-button[last()]/button",

                CHANNEL_CONVERSATION_JUMP_IN_BUTTON_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE="//calling-thread-header//calling-live-roster/div/img[@pl-upn='%s']/../../../../calling-join-button/button",

                CHANNEL_CONVERSATION_MEETUP_TITLE_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE="//calling-thread-header//calling-live-roster/div/img[@pl-upn='%s']/../../../div/div[contains(@class,'title')]",

                CHANNEL_PERSISTENT_INDICATOR_JUMP_IN_BUTTON_XPATH="//calling-persistent-indicator//div[contains(@title,'%s')]/../..//calling-join-button/button",

                CHANNEL_CONVERSATION_AVATAR_IN_CALLING_HEADER_ROSTER_XPATH_TEMPLATE="//calling-thread-header//calling-live-roster/div/img[@pl-upn='%s']/../img[@pl-upn]",

                CHANNEL_CONVERSATION_CALL_MONITOR_XPATH="//calling-monitor/div[contains(@class,'ts-show-cursor')]",

                CHANNEL_CONVERSATION_MEETUP_ENDED_XPATH_TEMPLATE="(//div[contains(@class,'ts-message-list-item')]//img[@pl-upn='%s'])[last()]/../../../div[contains(.,'%s')]",

                CHANNEL_CONVERSATION_MEETUP_ENDED_MESG="ended:",
                CHANNEL_PERSISTENT_INDICATOR_MORE_BUTTON_XPATH="//calling-persistent-indicator//a[contains(@class,'toggle-button')]",
                CALLING_SCREEN_XPATH="//calling-screen",
                CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_TEMPLATE="//calling-participant-stream//img[@pl-upn='%s']",
                CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_TEMPLATE="//calling-stage//calling-participant-stream//img[@pl-upn='%s']",
                CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_ENTRY="//calling-participant-stream//img[@pl-upn]",
                CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_ENTRY="//calling-stage//calling-participant-stream//img[@pl-upn]",
                CALLING_SCREEN_PARTICIPANT_SHARING_SCREEN_AVATAR_XPATH_TEMPLATE="//div[contains(@class,'PRESENTATION')]//calling-stage//calling-participant-stream//img[@pl-upn='%s']",
                CALLING_SCREEN_SHARE_DESKTOP_PANEL_XPATH="//div[contains(@class,'ts-calling-screensharing-panel')]",
                CALLING_SCREEN_SHARE_DESKTOP_PANEL_SCREEN_XPATH="//div[contains(@class,'ts-calling-screensharing-panel')]//div[contains(@class,'screen')]",
                CALLING_SCREEN_HANGUP_BUTTON_XPATH="//button[contains(@class,'ts-hangup')]",
                CALLING_SCREEN_SHARE_DESKTOP_BUTTON_XPATH="//button[contains(@class,'share-desktop')]",
                CALLING_SCREEN_PARTICIPANT_STREAM_XPATH="//calling-participant-stream",
                CALLING_SCREEN_TOGGLE_VIDEO_BUTTON_XPATH="//button[contains(@title,'video')]",
                CALLING_SCREEN_MEETUP_TITLE_XPATH="//editable-text//div[contains(@class,'title')]",
                CALLING_SCREEN_MEETUP_TITLE_INPUT_XPATH="//editable-text//input",
                CALLING_SCREEN_MEETUP_TITLE_SAVE_XPATH="//span[@title='Save title']",
                CALLING_MYSELF_VIDEO_XPATH="//calling-myself-video//canvas[@width]",
                CALLING_MYSELF_AVATAR_XPATH="//calling-myself-video/div[contains(@class,'audioOnly')]",
                CALLING_SCREEN_TOGGLE_CHAT_ENABLED_XPATH="//button[not(@disabled) and contains(@class,'toggle-chat')]",
                CALLING_SCREEN_ADD_PARTICIPANT_BUTTON_XPATH="//button[not(@disabled) and contains(@class,'toggle-roster')]",
                CALLING_SCREEN_IN_CHAT_PANE_XPATH="//context-message-pane",
                CALLING_SCREEN_MESSAGE_EDITOR_XPATH="//div[@data-tid='messageEditor']",
                CALLING_SCREEN_MESSAGES_PANE_TEXT_XPATH_TEMPLATE="//div[@data-tid='messageBodyContent']//div[contains(text(),'%s')]",
                CALLING_SCREEN_MESSAGE_INPUT_CSS=".ts-add-message .cke_contents div.cke_reset",
                CALLING_SCREEN_ADD_PARTICIPANT_PANE_XPATH="//calling-roster",
                CALLING_SCREEN_INVITE_INPUT_XPATH="//calling-roster-search//input[@id='searchInput']",
                CALLING_SCREEN_SEARCH_RESULT_USER_XPATH_TEMPLATE="//calling-roster-search-results//img[@pl-upn='%s']",
                CALLING_SCREEN_USER_CONNECTING_XPATH_TEMPLATE="//calling-roster-section//div[contains(@class,'roster_list_title')]/..//img[@pl-upn='%s']",
                CHAT_LIST_XPATH="//chat-list",
                CHANNEL_LIST_XPATH="//channel-list",
                GENERAL_CHAT_FOR_1ST_TEAM="//channel-list//a[contains(@title,'General')]",
                APP_BAR_CHAT_BUTTON_XPATH="//app-bar//button[@data-tid='app-bar-2']",
                APP_BAR_TEAMS_BUTTON_XPATH="//app-bar//button[@data-tid='app-bar-3']",
                CALLING_HEADER_MENU_XPATH="//calling-header//button[contains(@title,'Toggle sidebar')]",
                LEFT_RAIL_USER_INFO_XPATH="//user-information/div[contains(@class,'app-user-information')]",
                CALL_HANGING_UP_XPATH="//div[contains(@class,'call-state-layer')]",
                FIND_ELEMENT_BY_XPATH_JS_TEMPLATE="var elem=document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;",
                SCROLL_DOWN_ELEMENT_JS="elem.scrollTop=elem.scrollHeight;",
                SCROLL_UP_ELEMENT_JS="elem.scrollTop=0;",
                LOGOUT_EXE_ANGULAR_JS="angular.element(document.body).injector().get('authenticationService').logOut();",
                CALL_HANGUP_EXE_ANGULAR_JS="angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stop();",
                CALL_STOP_VIDEO_EXE_ANGULAR_JS="angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stopVideo();",
                CALL_START_VIDEO_EXE_ANGULAR_JS="angular.element(document.body).injector().get('callingService').callRegistry.calls[0].startVideo();",
                TOGGLE_CALLING_HEADER_MENU_JS="document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();",
                TYPE_TEXT_TO_XPATH_ELEMENT_JS_TEMPLATE="document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='%s';";



        Assert.assertTrue(areStringsSame(ELECTRON_APP_HANDLER_XPATH, ORIG_ELECTRON_APP_HANDLER_XPATH));
        Assert.assertTrue(areStringsSame(CHANNEL_LOADING_SPINNER_XPATH, ORIG_CHANNEL_LOADING_SPINNER_XPATH));
        Assert.assertTrue(areStringsSame(CHANNEL_MESSAGE_LIST_XPATH, ORIG_CHANNEL_MESSAGE_LIST_XPATH));
        Assert.assertTrue(areStringsSame(SPACES_USER_INFO_ELEM_XPATH, ORIG_SPACES_USER_INFO_ELEM_XPATH));
        Assert.assertTrue(areStringsSame(SPACES_OPTIONS_DROPDOWN_BUTTON_XPATH, ORIG_SPACES_OPTIONS_DROPDOWN_BUTTON_XPATH));
        Assert.assertTrue(areStringsSame(MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH, ORIG_MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH));
        Assert.assertTrue(areStringsSame(MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH_MORE_ACCURATE, ORIG_MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH_MORE_ACCURATE));
        Assert.assertTrue(areStringsSame(SHOW_MORE_TEAMS_BUTTON_XPATH, ORIG_SHOW_MORE_TEAMS_BUTTON_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_WINDOW_XPATH, ORIG_CALL_NOTIFICATION_WINDOW_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_WINDOW_IS_CALLING_MESG_XPATH, ORIG_CALL_NOTIFICATION_WINDOW_IS_CALLING_MESG_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_WINDOW_IS_NUDGING_MESG_XPATH, ORIG_CALL_NOTIFICATION_WINDOW_IS_NUDGING_MESG_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_ACCEPT_CALL_VIDEO_BUTTON_XPATH, ORIG_CALL_NOTIFICATION_ACCEPT_CALL_VIDEO_BUTTON_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_ACCEPT_CALL_AUDIO_BUTTON_XPATH, ORIG_CALL_NOTIFICATION_ACCEPT_CALL_AUDIO_BUTTON_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_REJECT_CALL_BUTTON_XPATH, ORIG_CALL_NOTIFICATION_REJECT_CALL_BUTTON_XPATH));
        Assert.assertTrue(areStringsSame(CALL_NOTIFICATION_JUMP_IN_CALL_BUTTON_XPATH, ORIG_CALL_NOTIFICATION_JUMP_IN_CALL_BUTTON_XPATH));
        /*areStringsSame(ORIG_, );   */
        /*areStringsSame(ORIG_, );   */
        /*areStringsSame(ORIG_, );   */

    }

    @Test
    public void test2() {

        String xpath = getXPath(div, equals, class_att, "class") + getChildNodeXPath(input, equals, id, "search");
        String xpath2 = "//div[@class='class'][.//input[@id='search']]";
        Assert.assertTrue(areStringsSame(xpath, xpath2));


        String a = "//input[@id='q']";
        String q = getXPath(input, equals, id, "q");
        Assert.assertTrue(areStringsSame(a, q));


    }

    @Test
    public void test3() {

    }

    @Test
    public void test4() {

    }

    @Test
    public void test5() {

        /** This selector shows limitation of current XPath class element adding [in this case is shown how during addEntry is not single_slash and element.div added into class recognized as same entries so each have its, own xpath.... /div[contains(@class,'pnl')]/div[not(contains(@class,'collapsed')] ] */

       



        String xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.ROLE, "dialog") + getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.ID, "dialogWrapper") + getXPath("div", equals, dataPath, "root");
        System.out.println("$x(\"" + xpath + "\")");
        String xpath2="//div[@role='dialog']//div[contains(@id,'dialogWrapper')]//div[@data-path='root']";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath2= getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.ROLE, "dialog") +  getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.ID, "dialogWrapper") + getXPath("div", equals, dataPath, "root");
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

//        xpath= getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.OR_EQUALS, new AttributeValues(ATTRIBUTES.DATA_PATH, new LinkedList<String>(){{add("pnlNoAccount lnkCurrent");add("pnlNoAccount lnkSavings"); add("pnlNoAccount lnkAuto"); add("pnlNoAccount hbxAuto lnkAutoYodlee");}})) + getXPath(ELEMENTS.A);
//        System.out.println("$x(\"" + xpath + "\")");
//        xpath2="//div[@data-path='pnlNoAccount lnkCurrent' or @data-path='pnlNoAccount lnkSavings' or @data-path='pnlNoAccount lnkAuto' or @data-path='pnlNoAccount hbxAuto lnkAutoYodlee']/a";
//        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlBasicInfo pnlYodleeIframe") + getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlYodleeIframe") + getXPath(singleSlash, span, equals, text, "Start Scraping") +
//                getXPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.CLASS, new AttributeValues(new LinkedList<String>()
//                {
//            {
//                add("start");
//                add("apply");
//                add("content");
//                add("control");
//                add("submit");
//            }
//                }
//                ));
//        System.out.println("$x(\"" + xpath + "\")");
//        xpath2="//div[@data-path='pnlBasicInfo pnlYodleeIframe']//div[contains(@wicketpath,'pnlYodleeIframe')][//span[text()='Start Scraping']]//a[contains(@class,'start') and contains(@class,'apply') and contains(@class,'content') and contains(@class,'control') and contains(@class,'submit')]";
//        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath=getXPath(ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "checked");
        System.out.println("$x(\"" + xpath + "\")"); 
        xpath2="[@class='checked']";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath = getXPath(ACTIONS.ATTRIBUTE_NOT_EQUALS_VALUE, ATTRIBUTES.CLASS, "checked");
        System.out.println("$x(\"" + xpath + "\")"); 
        xpath2="[not(@class='checked')]";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath=getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.DATA_PATH, "pnlApplicationList rptApplication") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.DATA_PATH, "pnlApplication btnStart") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "btnStart_submit");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2="/div[contains(@data-path,'pnlApplicationList rptApplication')][contains(@data-path,'pnlApplication btnStart')]/a[contains(@wicketpath,'btnStart_submit')]";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_4") + getXPath(ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_4_title") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Documents");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2="//div[@wicketpath='multiFlow_panels_4']//span[@wicketpath='multiFlow_panels_4_title'][contains(text(),'Documents')]";
        Assert.assertEquals("Failed not the same", xpath2, xpath);
        
        String WORKFLOW_TAB=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_0");
        System.out.println("WORKFLOW_TAB ---> $x(\"" + WORKFLOW_TAB + "\")");

        String WORKFLOW_PANEL_TITLE=WORKFLOW_TAB + getXPath(ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_0_header_title") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Workflow");
        System.out.println("WORKFLOW_PANEL_TITLE ---> $x(\"" + WORKFLOW_PANEL_TITLE + "\")");

        String WORKFLOW_PANEL_HIDE=WORKFLOW_TAB + getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "collapse");
        System.out.println("WORKFLOW_PANEL_HIDE ---> $x(\"" + WORKFLOW_PANEL_HIDE + "\")");

        String WORKFLOW_PANEL_HIDDEN=WORKFLOW_PANEL_HIDE + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none");
        System.out.println("WORKFLOW_PANEL_HIDDEN ---> $x(\"" + WORKFLOW_PANEL_HIDDEN + "\")");

        String WORKFLOW_PANEL_NOT_HIDDEN=WORKFLOW_PANEL_HIDE + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none");
        System.out.println("WORKFLOW_PANEL_NOT_HIDDEN ---> $x(\"" + WORKFLOW_PANEL_NOT_HIDDEN + "\")");

        String FINANCE_TOOL_TAB=             getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_1");
        System.out.println("FINANCE_TOOL_TAB ---> $x(\"" + FINANCE_TOOL_TAB + "\")");

        String FINANCE_TOOL_TAB_TITLE=       FINANCE_TOOL_TAB + getXPath(ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_1_header_title") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Finance Tool");
        System.out.println("FINANCE_TOOL_TAB_TITLE ---> $x(\"" + FINANCE_TOOL_TAB_TITLE + "\")");

        String FINANCE_TOOL_PANEL_HIDE=      FINANCE_TOOL_TAB + getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "collapse");
        System.out.println("FINANCE_TOOL_PANEL_HIDE ---> $x(\"" + FINANCE_TOOL_PANEL_HIDE + "\")");

        String FINANCE_TOOL_PANEL_HIDDEN=    FINANCE_TOOL_PANEL_HIDE + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none");
        System.out.println("FINANCE_TOOL_PANEL_HIDDEN ---> $x(\"" + FINANCE_TOOL_PANEL_HIDDEN + "\")");

        String FINANCE_TOOL_PANEL_NOT_HIDDEN=FINANCE_TOOL_PANEL_HIDE + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none");
        System.out.println("FINANCE_TOOL_PANEL_NOT_HIDDEN ---> $x(\"" + FINANCE_TOOL_PANEL_NOT_HIDDEN + "\")");
        
//        xpath=getXPath(div, equals, dataPath,"pnlBlack pnlInfo lnkEdit") + getXPath(singleSlash, button, contains, wicketpath, "pnlInfo_c_w_lnkEdit_script");
//        System.out.println(xpath);
//
//        xpath=getXPath(div, equals, dataPath,"pnlBlack pnlInfo lnkEdit") + getXPath(singleSlash, button, contains, wicketpath, "pnlInfo_c_w_lnkEdit_script");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlBlack pnlInfo lnkEdit']/a[contains(@wicketpath,'pnlInfo_c_w_lnkEdit_script')]";
//        Assert.assertEquals("Not equals!!", xpath, xpath2);

//        xpath=getXPath(ELEMENTS.TD, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.DATA_PATH, "pnlMain pnlManualKYC tblKycTable 0 cmbStatus") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.AND_CONTAINS, new AttributeValues(wicketpath, new LinkedList<String>() {{ add("pnlManualKYC"); add("tblKycTable"); add("cmbStatus"); }} ));
//        System.out.println(xpath);
//        xpath2="//td[@data-path='pnlMain pnlManualKYC tblKycTable 0 cmbStatus']/input[contains(@wicketpath,'pnlManualKYC') and contains(@wicketpath,'tblKycTable') and contains(@wicketpath,'cmbStatus')]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlManualKYC btnManualSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlManualKYC_c_w_btnManualSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlManualKYC btnManualSave']/a[contains(@wicketpath,'pnlManualKYC_c_w_btnManualSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico lblNazev") + getChildNodeXPath(span, equals, text, "Set FICO");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico lblNazev'][.//span[text()='Set FICO']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico txtFico") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "FICO") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetFico_c_w_txtFico");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico txtFico'][.//label[text()='FICO']]/input[contains(@wicketpath,'pnlSetFico_c_w_txtFico')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico txtExternalId") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Ticket Id") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetFico_c_w_txtExternalId");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico txtExternalId'][.//label[contains(text(),'Ticket Id')]]/input[contains(@wicketpath,'pnlSetFico_c_w_txtExternalId')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico txaDescription") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Comment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetFico_c_w_txaDescription_textarea");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico txaDescription'][.//label[contains(text(),'Comment')]]/textarea[contains(@wicketpath,'pnlSetFico_c_w_txaDescription_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico btnSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlSetFico_c_w_btnSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico btnSave']/a[contains(@wicketpath,'pnlSetFico_c_w_btnSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetFico btnCancel") + getXPath(singleSlash, a, contains, wicketpath, "pnlSetFico_c_w_btnCancel_cancel") + getChildNodeXPath(span, equals, text, "Cancel");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetFico btnCancel']/a[contains(@wicketpath,'pnlSetFico_c_w_btnCancel_cancel')][.//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAml cmbValue") + getChildNodeXPath(label, equals, text, "AML") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlAml_c_w_cmbValue");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAml cmbValue'][.//label[text()='AML']]/input[contains(@wicketpath,'pnlAml_c_w_cmbValue')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAml txtTicketId") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Ticket Id") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlAml_c_w_txtTicketId");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAml txtTicketId'][.//label[contains(text(),'Ticket Id')]]/input[contains(@wicketpath,'pnlAml_c_w_txtTicketId')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAml txaDescription") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Comment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "txaDescription_textarea");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAml txaDescription'][.//label[contains(text(),'Comment')]]/textarea[contains(@wicketpath,'txaDescription_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAml btnSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlAml_c_w_btnSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAml btnSave']/a[contains(@wicketpath,'pnlAml_c_w_btnSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAml btnCancel") + getXPath(singleSlash, a, contains, wicketpath, "pnlAml_c_w_btnCancel_cancel") + getChildNodeXPath(span, equals, text, "Cancel");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAml btnCancel']/a[contains(@wicketpath,'pnlAml_c_w_btnCancel_cancel')][.//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAml");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAml']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud lblFraud") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlFraud_c_w_lblFraud") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "Set Fraud");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud lblFraud']/div[contains(@wicketpath,'pnlFraud_c_w_lblFraud')]/span[text()='Set Fraud']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud cmbFraud") + getChildNodeXPath(label, equals, text, "Fraud") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlFraud_c_w_cmbFraud");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud cmbFraud'][.//label[text()='Fraud']]/input[contains(@wicketpath,'pnlFraud_c_w_cmbFraud')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud txtTiketId") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Ticket Id") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlFraud_c_w_txtTiketId");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud txtTiketId'][.//label[contains(text(),'Ticket Id')]]/input[contains(@wicketpath,'pnlFraud_c_w_txtTiketId')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud txaDescription") + getChildNodeXPath(ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Comment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlFraud_c_w_txaDescription_textarea");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud txaDescription'][.//label[contains(text(),'Comment')]]/textarea[contains(@wicketpath,'pnlFraud_c_w_txaDescription_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud btnCancel") + getXPath(singleSlash, a, contains, wicketpath, "pnlFraud_c_w_btnCancel_cancel") + getChildNodeXPath(span, equals, text, "Cancel");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud btnCancel']/a[contains(@wicketpath,'pnlFraud_c_w_btnCancel_cancel')][.//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlFraud btnSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlFraud_c_w_btnSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlFraud btnSave']/a[contains(@wicketpath,'pnlFraud_c_w_btnSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlRepeatCustomer");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlRepeatCustomer']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlRepeatCustomer lblRepeatCustomer") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlRepeatCustomer_c_w_lblRepeatCustomer") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "Repeat Customer");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlRepeatCustomer lblRepeatCustomer']/div[contains(@wicketpath,'pnlRepeatCustomer_c_w_lblRepeatCustomer')]/span[text()='Repeat Customer']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlRepeatCustomer txtRepeatCustomer") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlRepeatCustomer_c_w_txtRepeatCustomer");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlRepeatCustomer txtRepeatCustomer']/input[contains(@wicketpath,'pnlRepeatCustomer_c_w_txtRepeatCustomer')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlRepeatCustomer btnCancel") + getXPath(singleSlash, a, contains, wicketpath, "pnlRepeatCustomer_c_w_btnCancel_cancel") + getChildNodeXPath(span, equals, text, "Cancel");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlRepeatCustomer btnCancel']/a[contains(@wicketpath,'pnlRepeatCustomer_c_w_btnCancel_cancel')][.//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlRepeatCustomer btnSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlRepeatCustomer_c_w_btnSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlRepeatCustomer btnSave']/a[contains(@wicketpath,'pnlRepeatCustomer_c_w_btnSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetScoreOverride lblSetScoreOverride") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetScoreOverride_c_w_lblSetScoreOverride") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "Set score override");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetScoreOverride lblSetScoreOverride']/div[contains(@wicketpath,'pnlSetScoreOverride_c_w_lblSetScoreOverride')]/span[text()='Set score override']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetScoreOverride txtScoreOverride") + getChildNodeXPath(label, equals, text, "Value") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetScoreOverride_c_w_txtScoreOverride");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetScoreOverride txtScoreOverride'][.//label[text()='Value']]/input[contains(@wicketpath,'pnlSetScoreOverride_c_w_txtScoreOverride')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetScoreOverride txaNote") + getChildNodeXPath(label, equals, text, "Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetScoreOverride_c_w_txaNote_textarea");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetScoreOverride txaNote'][.//label[text()='Note']]/textarea[contains(@wicketpath,'pnlSetScoreOverride_c_w_txaNote_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetScoreOverride btnCancel") + getXPath(singleSlash, a, contains, wicketpath, "pnlSetScoreOverride_c_w_btnCancel_cancel") + getChildNodeXPath(span, equals, text, "Cancel");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetScoreOverride btnCancel']/a[contains(@wicketpath,'pnlSetScoreOverride_c_w_btnCancel_cancel')][.//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetScoreOverride btnSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlSetScoreOverride_c_w_btnSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetScoreOverride btnSave']/a[contains(@wicketpath,'pnlSetScoreOverride_c_w_btnSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAddNote lblAddNote") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlAddNote_c_w_lblAddNote") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "Add note");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAddNote lblAddNote']/div[contains(@wicketpath,'pnlAddNote_c_w_lblAddNote')]/span[text()='Add note']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAddNote txaNote") + getChildNodeXPath(label, contains, text, "Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlAddNote_c_w_txaNote_textarea");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAddNote txaNote'][.//label[contains(text(),'Note')]]/textarea[contains(@wicketpath,'pnlAddNote_c_w_txaNote_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAddNote btnCancel") + getXPath(singleSlash, a, contains, wicketpath, "pnlAddNote_c_w_btnCancel_cancel") + getChildNodeXPath(span, equals, text, "Cancel");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAddNote btnCancel']/a[contains(@wicketpath,'pnlAddNote_c_w_btnCancel_cancel')][.//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAddNote btnSave") + getXPath(singleSlash, a, contains, wicketpath, "pnlAddNote_c_w_btnSave_submit") + getChildNodeXPath(span, equals, text, "Save");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAddNote btnSave']/a[contains(@wicketpath,'pnlAddNote_c_w_btnSave_submit')][.//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlManualKYC chkKycManualSwitch") + getChildNodeXPath(label, equals, text, "Manually update") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlManualKYC_c_w_chkKycManualSwitch_checkbox");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlManualKYC chkKycManualSwitch'][.//label[text()='Manually update']]/input[contains(@wicketpath,'pnlManualKYC_c_w_chkKycManualSwitch_checkbox')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlManualKYC chkKycManualSwitch") + getChildNodeXPath(label, equals, text, "Manually update") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "vcheckbox control") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "checked");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlManualKYC chkKycManualSwitch'][.//label[text()='Manually update']]/span[contains(@class,'vcheckbox control')]/a[@class='checked']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlUnsecuredLoan pnlUnsecuredLoan0 btnContinue0") + getXPath(singleSlash, a, contains, wicketpath, "pnlUnsecuredLoan0_c_w_btnContinue0_submit") + getChildNodeXPath(span, equals, text, "Continue");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlUnsecuredLoan pnlUnsecuredLoan0 btnContinue0']/a[contains(@wicketpath,'pnlUnsecuredLoan0_c_w_btnContinue0_submit')][.//span[text()='Continue']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlDetail pnlSelfEmployed cmbCountry") + getChildNodeXPath(label, equals, text, "Country") + getXPath(input, contains, wicketpath,  "pnlSelfEmployed_c_w_cmbCountry");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlDetail pnlSelfEmployed cmbCountry'][.//label[text()='Country']]//input[contains(@wicketpath,'pnlSelfEmployed_c_w_cmbCountry')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"rptDocuments " + 1 + " pnlDocuments lblStatus") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "check-icon") + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.CLASS, "uncheck-icon");
        System.out.println(xpath);
        xpath2="//div[@data-path='rptDocuments 1 pnlDocuments lblStatus'][contains(@class,'check-icon')][not(contains(@class,'uncheck-icon'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"rptDocuments " + 1 + " pnlDocuments lblStatus") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "uncheck-icon");
        System.out.println(xpath);
        xpath2="//div[@data-path='rptDocuments 1 pnlDocuments lblStatus'][contains(@class,'uncheck-icon')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"rptDocuments " + 1 + " pnlDocuments lblStatus") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "notset-icon");
        System.out.println(xpath);
        xpath2="//div[@data-path='rptDocuments 1 pnlDocuments lblStatus'][contains(@class,'notset-icon')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlBlack pnlEdit cmbDocumentType") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SELECT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlEdit_c_w_cmbDocumentType_combobox") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.OPTION, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.SELECTED, "selected");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlBlack pnlEdit cmbDocumentType']/select[contains(@wicketpath,'pnlEdit_c_w_cmbDocumentType_combobox')]/option[@selected='selected']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlBlack pnlEdit cmbDocSubtype") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SELECT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlEdit_c_w_cmbDocSubtype_combobox") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.OPTION, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.SELECTED, "selected");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlBlack pnlEdit cmbDocSubtype']/select[contains(@wicketpath,'pnlEdit_c_w_cmbDocSubtype_combobox')]/option[@selected='selected']";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, new AttributeValues("rptDocuments", "pnlDocuments lnkDetail")) + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A) + getXPath(singleSlash, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "link");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'rptDocuments') and contains(@data-path,'pnlDocuments lnkDetail')]/a[//span[@class='link']]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, new AttributeValues("rptDocuments", "pnlDocuments")) + getXPath(ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.DATA_TYPE, "panel") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "clickable") + getXPath(singleSlash, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "link") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.DATA_PATH, "1");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'rptDocuments') and contains(@data-path,'pnlDocuments')][@data-type='panel'][contains(@class,'clickable')][//span[@class='link']][contains(@data-path,'1')]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlStage1 chkCheck1") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "vcheckbox control") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.ID, "checkbox");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlStage1 chkCheck1']/span[contains(@class,'vcheckbox control')]/a[contains(@id,'checkbox')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlStage1 btnCompleteScript") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlStage1_c_w_btnCompleteScript_script") + getChildNodeXPath(span, equals, text, "Complete Validation");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlStage1 btnCompleteScript']/a[contains(@wicketpath,'pnlStage1_c_w_btnCompleteScript_script')][.//span[text()='Complete Validation']]";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(ELEMENTS.DIV, ACTIONS.OR_CONTAINS, ATTRIBUTES.CLASS, new AttributeValues("busy-indicator-big", "busyIndicator", "dblclick-fix-layer")) + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "block") + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.STYLE, "none");
//        System.out.println(xpath);
//        xpath2="//div[contains(@class,'busy-indicator-big') or contains(@class,'busyIndicator') or contains(@class,'dblclick-fix-layer')][contains(@style,'block')][not(contains(@style,'none'))]";
//        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(ELEMENTS.TD, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.DATA_PATH, "pnlMain pnlManualKYC tblKycTable 0 cmbStatus") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.AND_CONTAINS, wicketpath, new AttributeValues("pnlManualKYC", "tblKycTable", "cmbStatus"));
//        System.out.println(xpath);
//        xpath2="//td[@data-path='pnlMain pnlManualKYC tblKycTable 0 cmbStatus']/input[contains(@wicketpath,'pnlManualKYC') and contains(@wicketpath,'tblKycTable') and contains(@wicketpath,'cmbStatus')]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlSetScoreOverride txaNote") + getChildNodeXPath(label, equals, text, "Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlSetScoreOverride_c_w_txaNote_textarea");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlSetScoreOverride txaNote'][.//label[text()='Note']]/textarea[contains(@wicketpath,'pnlSetScoreOverride_c_w_txaNote_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAddNote txaNote") + getXPath(singleSlash, label, equals, text, "Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXT_AREA, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlAddNote_c_w_txaNote_textarea");
        System.out.println(xpath);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlManualKYC chkKycManualSwitch") + getChildNodeXPath(label, equals, text, "Manually update") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "vcheckbox control") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.ID, "checkbox");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlManualKYC chkKycManualSwitch'][.//label[text()='Manually update']]/span[contains(@class,'vcheckbox control')]/a[contains(@id,'checkbox')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlStage2") + getXPath(singleSlash, a, contains, wicketpath, "pnlStage2_label") + getXPath(ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "Stage 2: Credit Review");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlStage2']/a[contains(@wicketpath,'pnlStage2_label')][text()='Stage 2: Credit Review']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_2") + getXPath(div, equals, dataPath,"pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped lblWarnScoreCardNotSetuped") + getXPath(div, contains, wicketpath,  "pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped") + getChildNodeXPath(span, equals, text, "Score card was not fully set-up yet!");
        System.out.println(xpath);
        xpath2="//div[@wicketpath='multiFlow_panels_2']//div[@data-path='pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped lblWarnScoreCardNotSetuped']//div[contains(@wicketpath,'pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped')][.//span[text()='Score card was not fully set-up yet!']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.UL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: block") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.LI, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "ui-menu-item") + getXPath(singleSlash, ELEMENTS.A);
        System.out.println(xpath);
        xpath2="//ul[contains(@style,'display: block')]/li[@class='ui-menu-item']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlCoLoanTitle txtTitle") + getChildNodeXPath(label, contains, text, "Title") + getXPath(ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlCoLoanTitle_c_w_txtTitle_tb");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlCoLoanTitle txtTitle'][.//label[contains(text(),'Title')]]//input[contains(@wicketpath,'pnlCoLoanTitle_c_w_txtTitle_tb')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlNames txtFirstName") + getChildNodeXPath(label, equals, text, "First name") + getXPath(input, contains, wicketpath,  "pnlNames_c_w_txtFirstName");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlNames txtFirstName'][.//label[text()='First name']]//input[contains(@wicketpath,'pnlNames_c_w_txtFirstName')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlCoLoanNamesSuff txtMiddleName") + getChildNodeXPath(label, contains, text, "Middle name") + getXPath(input, contains, wicketpath,  "pnlCoLoanNamesSuff_c_w_txtMiddleName");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlCoLoanNamesSuff txtMiddleName'][.//label[contains(text(),'Middle name')]]//input[contains(@wicketpath,'pnlCoLoanNamesSuff_c_w_txtMiddleName')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlNames txtLastName") + getChildNodeXPath(label, equals, text, "Last name") + getXPath(input, contains, wicketpath,  "pnlNames_c_w_txtLastName");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlNames txtLastName'][.//label[text()='Last name']]//input[contains(@wicketpath,'pnlNames_c_w_txtLastName')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlCoLoanNamesSuff txtSuffix") + getChildNodeXPath(label, contains, text, "Suffix") + getXPath(input, contains, wicketpath,  "pnlCoLoanNamesSuff_c_w_txtSuffix");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlCoLoanNamesSuff txtSuffix'][.//label[contains(text(),'Suffix')]]//input[contains(@wicketpath,'pnlCoLoanNamesSuff_c_w_txtSuffix')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlGender rgrGender radMale") + getChildNodeXPath(label, equals, text, "Male") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "vradiobutton control") + getXPath(singleSlash, ELEMENTS.A);
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlGender rgrGender radMale'][.//label[text()='Male']]/span[@class='vradiobutton control']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlMain pnlGender rgrGender radFemale") + getChildNodeXPath(label, equals, text, "Female") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "vradiobutton control") + getXPath(singleSlash, ELEMENTS.A);
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlMain pnlGender rgrGender radFemale'][.//label[text()='Female']]/span[@class='vradiobutton control']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlNoEmplyments pnlPaye lnkAddPaye") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.OR_CONTAINS, wicketpath, new AttributeValues("pnlPaye_c_w_lnkAddPaye_dialog", "pnlPaye_c_w_lnkAddPaye_submit"));
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlNoEmplyments pnlPaye lnkAddPaye']/a[contains(@wicketpath,'pnlPaye_c_w_lnkAddPaye_dialog') or contains(@wicketpath,'pnlPaye_c_w_lnkAddPaye_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlDetail pnlEmployed cmbJobTitle") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT);
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlDetail pnlEmployed cmbJobTitle']/input";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(ELEMENTS.DIV, ACTIONS.OR_CONTAINS, ATTRIBUTES.CLASS, new AttributeValues("busy-indicator-big", "busyIndicator", "dblclick-fix-layer")) + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "block") + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.STYLE, "none");
//        System.out.println(xpath);
//        xpath2="//div[contains(@class,'busy-indicator-big') or contains(@class,'busyIndicator') or contains(@class,'dblclick-fix-layer')][contains(@style,'block')][not(contains(@style,'none'))]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlDetail pnlSelfEmployed pnlAddressField1") + getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.ID, "googlediv") + getChildNodeXPath(label, contains, text, "Address line 1") + getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.INPUT);
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlDetail pnlSelfEmployed pnlAddressField1']//div[contains(@id,'googlediv')][.//label[contains(text(),'Address line 1')]]//input";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlDetail pnlSelfEmployed txtBusinessEndDate") + getXPath(singleSlash, label, contains, text, "End date") + getXPath_Containswicketpath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, "pnlSelfEmployed_c_w_txtBusinessEndDate");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlDetail pnlSelfEmployed txtBusinessEndDate'][//label[contains(text(),'End date')]]/input[contains(@wicketpath,'pnlSelfEmployed_c_w_txtBusinessEndDate')]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.UL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: block") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.LI, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.CLASS, "ui-menu-item") + getXPath(singleSlash, ELEMENTS.A);
        System.out.println(xpath);
        xpath2="//ul[contains(@style,'display: block')]/li[@class='ui-menu-item']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlDetail pnlUnemployed txtUnemployedEndDate") + getChildNodeXPath(getXPath(ELEMENTS.LABEL, ACTIONS.AND_CONTAINS, ATTRIBUTES.TEXT, "End date")) + getXPath(ELEMENTS.INPUT);
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlDetail pnlUnemployed txtUnemployedEndDate'][.//label[contains(text(),'End date') and contains(text(),'End date')]]/input";
//        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlAccountList btnImDone") + getXPath(singleSlash, button, contains, wicketpath, "btnImDone_submit") + getXPath(singleSlash, getXPath(ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, new AttributeValues("I", "m done")));
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlAccountList btnImDone']/a[contains(@wicketpath,'btnImDone_submit')][//span[contains(text(),'I')][contains(text(),'m done')]]";
//        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlNoLiability lnkAddCreditCard") + getXPath_DirectAButtonContainsOrContainswicketpath("lnkAddCreditCard_dialog", "lnkAddCreditCard_submit");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlNoLiability lnkAddCreditCard']/a[contains(@wicketpath,'lnkAddCreditCard_dialog') or contains(@wicketpath,'lnkAddCreditCard_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);


//        xpath=getXPath(ELEMENTS.DIV, ACTIONS.OR_CONTAINS, ATTRIBUTES.CLASS, new AttributeValues("busy-indicator-big", "busyIndicator", "dblclick-fix-layer")) + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "none") + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.STYLE, "block");
//        System.out.println(xpath);
//        xpath2="//div[contains(@class,'busy-indicator-big') or contains(@class,'busyIndicator') or contains(@class,'dblclick-fix-layer')][contains(@style,'none')][not(contains(@style,'block'))]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"btnAddLiability") + getXPath(singleSlash, a, contains, wicketpath, "btnAddLiability_submit") + getChildNodeXPath(span, equals, text, "Save and close");
        System.out.println(xpath);
        xpath2="//div[@data-path='btnAddLiability']/a[contains(@wicketpath,'btnAddLiability_submit')][.//span[text()='Save and close']]";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(doubleSlash, div, andContains, dataPath, "pnlNoLiability PersonalLoan") + getXPath_DirectAButtonContainsOrContainswicketpath("PersonalLoan_dialog", "PersonalLoan_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'PersonalLoan')]/a[contains(@wicketpath,'PersonalLoan_dialog') or contains(@wicketpath,'PersonalLoan_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "CreditCard") + getXPath_DirectAButtonContainsOrContainswicketpath("AddCreditCard_dialog", "CreditCard_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'CreditCard')]/a[contains(@wicketpath,'AddCreditCard_dialog') or contains(@wicketpath,'CreditCard_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "MaintenancePayment") + getXPath_DirectAButtonContainsOrContainswicketpath("MaintenancePayment_dialog", "MaintenancePayment_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'MaintenancePayment')]/a[contains(@wicketpath,'MaintenancePayment_dialog') or contains(@wicketpath,'MaintenancePayment_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "Other") + getXPath_DirectAButtonContainsOrContainswicketpath("Other_dialog", "Other_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Other')]/a[contains(@wicketpath,'Other_dialog') or contains(@wicketpath,'Other_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "CarLoan") + getXPath_DirectAButtonContainsOrContainswicketpath("CarLoan_dialog", "CarLoan_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'CarLoan')]/a[contains(@wicketpath,'CarLoan_dialog') or contains(@wicketpath,'CarLoan_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "StudentLoan") + getXPath_DirectAButtonContainsOrContainswicketpath("StudentLoan_dialog", "StudentLoan_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'StudentLoan')]/a[contains(@wicketpath,'StudentLoan_dialog') or contains(@wicketpath,'StudentLoan_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "Rent") + getXPath_DirectAButtonContainsOrContainswicketpath("Rent_dialog", "Rent_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Rent')]/a[contains(@wicketpath,'Rent_dialog') or contains(@wicketpath,'Rent_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "Utilities") + getXPath_DirectAButtonContainsOrContainswicketpath("Utilities_dialog", "Utilities_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Utilities')]/a[contains(@wicketpath,'Utilities_dialog') or contains(@wicketpath,'Utilities_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "Childcare") + getXPath_DirectAButtonContainsOrContainswicketpath("Childcare_dialog", "Childcare_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Childcare')]/a[contains(@wicketpath,'Childcare_dialog') or contains(@wicketpath,'Childcare_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, andContains, dataPath, "pnlNoLiability", "Mortgage") + getXPath_DirectAButtonContainsOrContainswicketpath("Mortage_dialog", "Mortgage_submit");
//        System.out.println(xpath);
//        xpath2="//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Mortgage')]/a[contains(@wicketpath,'Mortage_dialog') or contains(@wicketpath,'Mortgage_submit')]";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_4_header") + getChildNodeXPath(getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "collapse") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none"));
        System.out.println(xpath);
        xpath2="//div[@wicketpath='multiFlow_panels_4_header'][.//a[contains(@class,'collapse')][contains(@style,'display: none')]]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TITLE, "Documents 1") + getXPath(ACTIONS.ATTRIBUTE_NOT_EQUALS_VALUE, ATTRIBUTES.TITLE, "Documents 2") + getXPath(ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_4_header");
        System.out.println(xpath);
        xpath2="//div[@title='Documents 1'][not(@title='Documents 2')][@wicketpath='multiFlow_panels_4_header']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TITLE, "Documents 2") + getXPath(ACTIONS.ATTRIBUTE_NOT_EQUALS_VALUE, ATTRIBUTES.TITLE, "Documents 1") + getXPath(ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_5_header");
        System.out.println(xpath);
        xpath2="//div[@title='Documents 2'][not(@title='Documents 1')][@wicketpath='multiFlow_panels_5_header']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlAddSource pnlAccNam txtAccountName") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "pnlAccNam_c_w_txtAccountName") + getChildNodeXPath(label, contains, text, "Account name");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlAddSource pnlAccNam txtAccountName']/input[contains(@wicketpath,'pnlAccNam_c_w_txtAccountName')][.//label[contains(text(),'Account name')]]";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnl-adv-search txtSearch") + getXPath(singleSlash, label, equals, text, "SEARCH TEXT") + getXPath_Containswicketpath(input, "txtSearch");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnl-adv-search txtSearch'][//label[text()='SEARCH TEXT']]//input[contains(@wicketpath,'txtSearch')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, equals, dataPath,"lnk-adv-options") + getXPath_DirectAButtonAndContainswicketpath("lnk-adv-options_script") + getXPath_SpanEqualsText("Hide advanced options");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='lnk-adv-options']/a[contains(@wicketpath,'lnk-adv-options_script') and contains(@wicketpath,'lnk-adv-options_script')]//span[text()='Hide advanced options']";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, equals, dataPath,"lnk-adv-options") + getXPath_DirectAButtonAndContainswicketpath("lnk-adv-options_script") + getXPath_SpanEqualsText("Show advanced options");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='lnk-adv-options']/a[contains(@wicketpath,'lnk-adv-options_script') and contains(@wicketpath,'lnk-adv-options_script')]//span[text()='Show advanced options']";
//        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlStage2") + getXPath(contains, class_att, "widget-expanded") + getXPath(notContains, class_att, "widget-collapsed");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlStage2'][contains(@class,'widget-expanded')][not(contains(@class,'widget-collapsed'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlStage2") + getXPath(contains, class_att, "widget-collapsed") + getXPath(notContains, class_att, "widget-expanded");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlStage2'][contains(@class,'widget-collapsed')][not(contains(@class,'widget-expanded'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, wicketpath, "multiFlow_panels_2") + getXPath(div, equals, dataPath,"pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped") + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.CLASS, "invisible") + getXPath(div, contains, wicketpath,  "pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped") + getChildNodeXPath(span, equals, text, "Score card was not fully set-up yet!");
        System.out.println(xpath);
        xpath2="//div[@wicketpath='multiFlow_panels_2']//div[@data-path='pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped'][not(contains(@class,'invisible'))]//div[contains(@wicketpath,'pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped')][.//span[text()='Score card was not fully set-up yet!']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlBlack lnkClose") + getXPath(singleSlash, a, contains, wicketpath, "lnkClose_cancel") + getXPath(singleSlash, span, equals, class_att, "main") + getXPath(singleSlash, span, equals, class_att, "link");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlBlack lnkClose']/a[contains(@wicketpath,'lnkClose_cancel')]/span[@class='main']/span[@class='link']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath=getXPath(div, equals, dataPath,"pnlBlack lnkClose") + getXPath(singleSlash, a, contains, wicketpath, "lnkClose_cancel") + getChildNodeXPath(span, equals, class_att, "main") + getChildNodeXPath(span, equals, class_att, "link");
        System.out.println(xpath);
        xpath2="//div[@data-path='pnlBlack lnkClose']/a[contains(@wicketpath,'lnkClose_cancel')][.//span[@class='main']][.//span[@class='link']]";
        Assert.assertEquals("not equals", xpath, xpath2);

//        xpath=getXPath(div, equals, dataPath,"pnlStageHeader") + getXPath_DirectAButtonAndContainswicketpath("embeddedForm_3", "pnlStageHeader") + getXPath(equals, text, "Stage 3: Pre-Drawdown");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlStageHeader']/a[contains(@wicketpath,'embeddedForm_3') and contains(@wicketpath,'pnlStageHeader')][text()='Stage 3: Pre-Drawdown']";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, equals, dataPath,"pnlStageHeader") + getXPath_DirectAButtonAndContainswicketpath("embeddedForm_3", "pnlStageHeader");
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlStageHeader']/a[contains(@wicketpath,'embeddedForm_3') and contains(@wicketpath,'pnlStageHeader')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
//
//        xpath=getXPath(div, equals, dataPath,"pnlYouCanborrow3 lblYouCanborrow3") + getXPath_AndContainswicketpath(singleSlash, div, "pnlYouCanborrow3", "lblYouCanborrow3") + getXPath(singleSlash, span, orContains, text, new AttributeValues("Unfortunately, you have been approved only for £", "We are happy to inform you that you have been approved for this amount."));
//        System.out.println(xpath);
//        xpath2="//div[@data-path='pnlYouCanborrow3 lblYouCanborrow3']/div[contains(@wicketpath,'pnlYouCanborrow3') and contains(@wicketpath,'lblYouCanborrow3')]/span[contains(text(),'Unfortunately, you have been approved only for £') or contains(text(),'We are happy to inform you that you have been approved for this amount.')]";
//        Assert.assertEquals("not equals", xpath, xpath2);
    }

    private boolean areStringsSame(String getXPath, String stringToCompare){
        System.out.println("areStringsSame ? ----> \n " + getXPath + " \n " + stringToCompare + "");
        return getXPath.equals(stringToCompare);
    }

    private void areStringsSame(String getXPath){
        System.out.println(getXPath);
    }

    @Test
    public void test6() {










//        areStringsSame(getXPath(div, andContains, dataPath, new AttributeValues("pnlYouCanborrow", "lblYouCanborrow")) + getXPath_AndContainswicketpath(singleSlash, div, "pnlYouCanborrow", "lblYouCanborrow") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow') and contains(@data-path,'lblYouCanborrow')]/div[contains(@wicketpath,'pnlYouCanborrow') and contains(@wicketpath,'lblYouCanborrow')]/span");
//
//        areStringsSame(getXPath(div, andContains, dataPath, new AttributeValues("pnlYouCanborrow1", "lblYouCanborrow1")) + getXPath_AndContainswicketpath(singleSlash, div, "pnlYouCanborrow1", "lblYouCanborrow1") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow1') and contains(@data-path,'lblYouCanborrow1')]/div[contains(@wicketpath,'pnlYouCanborrow1') and contains(@wicketpath,'lblYouCanborrow1')]/span");
//
//        areStringsSame(getXPath(div, andContains, dataPath, new AttributeValues("pnlYouCanborrow2", "lblYouCanborrow2")) + getXPath_AndContainswicketpath(singleSlash, div, "pnlYouCanborrow2", "lblYouCanborrow2") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow2') and contains(@data-path,'lblYouCanborrow2')]/div[contains(@wicketpath,'pnlYouCanborrow2') and contains(@wicketpath,'lblYouCanborrow2')]/span");
//
//        areStringsSame(getXPath(div, andContains, dataPath, new AttributeValues("pnlYouCanborrow3", "lblYouCanborrow3")) + getXPath_AndContainswicketpath(singleSlash, div, "pnlYouCanborrow3", "lblYouCanborrow3") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow3') and contains(@data-path,'lblYouCanborrow3')]/div[contains(@wicketpath,'pnlYouCanborrow3') and contains(@wicketpath,'lblYouCanborrow3')]/span");

        areStringsSame(getXPath(div, equals, dataType, "loancalc") + getXPath(div, equals, class_att, "sliders") + getXPath(singleSlash, div, equals, ariaDisabled, "true") + getXPath(contains, class_att, "loan"), "//div[@data-type='loancalc']//div[@class='sliders']/div[@aria-disabled='true'][contains(@class,'loan')]");

        areStringsSame(getXPath(input, equals, name, "userName"));

        areStringsSame(getXPath( PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "multiFlow_panels") /** todo - is default xpath building method which expects two basic ways of */ + getXPath(singleSlash, span, equals, text, "Form Tools") + getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "collapse"));

        areStringsSame(getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "multiFlow_panels") + getXPath(singleSlash, span, equals, text, "Form Tools") + getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "collapse") + getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none"));

        areStringsSame(getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "multiFlow_panels") + getXPath(singleSlash, span, equals, text, "Form Tools") + getXPath(ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.CLASS, "collapse") + getXPath(ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE, ATTRIBUTES.STYLE, "display: none"));


        String a="//div[contains(@wicketpath,'multiFlow_panels')][//span[text()='Form Tools']]//a[contains(@class,'collapse')]";
        String b="//div[contains(@wicketpath,'multiFlow_panels')][//span[text()='Form Tools']]//a[contains(@class,'collapse')][contains(@style,'display: none')]";
        String c="//div[contains(@wicketpath,'multiFlow_panels')][//span[text()='Form Tools']]//a[contains(@class,'collapse')][not(contains(@style,'display: none'))]";

//        areStringsSame()


        //getXPath(); /** todo - is default xpath building method which expects two basic ways of calling */

        /** "1st way" */
            /** getXPath(optional - PREFIX, mandatory - ELEMENTS, mandatory ACTIONS, mandatory ATTRIBUTES, mandatory String value or a AttributeValues() - that will be described later ) */
            getXPath(ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "multiFlow_panels");   /** that will produce           "//div[contains(@wicketpath,'multiFlow_panels')]"   */

        /** "2nd way" */
            /** getXPath(mandatory - ACTIONS, mandatory ATTRIBUTES, mandatory String value or a AttributeValues())  */
            getXPath(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, "Text to Validate");                       /** this one will create this   "[contains(text(),'Text to Validate')]"             */
//        escape.

        getXPath(div, equals, dataPath,"");                                                 /** is equivalent to */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.DATA_PATH, "");
//        getXPath(div, andContains, dataPath, "");                                            /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, "");
        getXPath(input, equals, name, "");                                                   /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.INPUT, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.NAME, "");
//        getXPath_AndContainswicketpath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, "", "", "");  /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.AND_CONTAINS, wicketpath, new AttributeValues("", "", ""));
//        getXPath_DivEqualsId("");                                                       /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.ID, "");
//        getXPath_Containswicketpath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, "");             /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "");
//        getXPath_DirectSpanEqualsText("");                                              /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, "");
//        getXPath(singleSlash, button, contains, wicketpath, "");                                   /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, wicketpath, "");
//        getXPath_DirectAButtonContainsOrContainswicketpath("", "");                     /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.OR_CONTAINS, wicketpath, new AttributeValues("", ""));
//        getXPath_DirectAButtonAndContainswicketpath("");                                /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.AND_CONTAINS, wicketpath, new AttributeValues("", ""));
//        getXPath(singleSlash, "stringText");                                          /** This one is only adding brackets around the variable - "[" + "stringText" + "]" */
//        getXPath_HasADescendantSpanText(ACTIONS.ATTRIBUTE_CONTAINS_VALUE, "");                          /** is equivalent to */ getXPath(singleSlash, getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, ""));
        getXPath(singleSlash, span, equals, text, "");                                        /** */ getXPath(singleSlash, getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, ""));
//        getXPath_HasADescendantSpanContainsText("");                                      /** */ getXPath(singleSlash, getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.SPAN, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, ""));
        getXPath(singleSlash, label, equals, text, "");                                       /** */ getXPath(singleSlash, getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_EQUALS_VALUE, ATTRIBUTES.TEXT, ""));
        getXPath(singleSlash, label, contains, text, "");                                     /** */ getXPath(singleSlash, getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.LABEL, ACTIONS.ATTRIBUTE_CONTAINS_VALUE, ATTRIBUTES.TEXT, ""));



    }

    @Test
    public void test7() {


        areStringsSame(getXPath(div, equals, wicketpath, "multiFlow_panels_0") + getXPath(div, equals, dataPath,"pnlStage2") + getXPath(button, contains, wicketpath.get(), "pnlStage2_label") + getXPath(equals, text, "Stage 2: Credit Review"));
    // When something is reapeating so often so you want to reduce code redundancy easily you can create simplistic method getXPath_WhatEverYouAreMissingThatItProvides("justOneStringParameter")
//      String xpath=getXPath(div, equals, wicketpath, "multiFlow_panels_0") + getXPath(div, equals, dataPath,"pnlStage2") + getXPath(singleSlash, button, contains, wicketpath, "pnlStage2_label") + getXPath(equals, text, "Stage 2: Credit Review");


    }
}