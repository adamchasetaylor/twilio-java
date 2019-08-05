/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.wireless.v1;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;

public class RatePlanCreator extends Creator<RatePlan> {
    private String uniqueName;
    private String friendlyName;
    private Boolean dataEnabled;
    private Integer dataLimit;
    private String dataMetering;
    private Boolean messagingEnabled;
    private Boolean voiceEnabled;
    private Boolean nationalRoamingEnabled;
    private List<String> internationalRoaming;
    private Integer nationalRoamingDataLimit;
    private Integer internationalRoamingDataLimit;

    /**
     * A user-provided string that uniquely identifies this resource as an
     * alternative to the Sid..
     *
     * @param uniqueName A user-provided string that uniquely identifies this
     *                   resource as an alternative to the Sid.
     * @return this
     */
    public RatePlanCreator setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * A user-provided string that identifies this resource. Non-unique..
     *
     * @param friendlyName A user-provided string that identifies this resource.
     * @return this
     */
    public RatePlanCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Defines whether SIMs are capable of using GPRS/3G/LTE data connectivity..
     *
     * @param dataEnabled Defines whether SIMs are capable of using GPRS/3G/LTE
     *                    data connectivity.
     * @return this
     */
    public RatePlanCreator setDataEnabled(final Boolean dataEnabled) {
        this.dataEnabled = dataEnabled;
        return this;
    }

    /**
     * Network-enforced limit specifying the total Megabytes of data usage (download
     * and upload combined) allowed during one month on the 'home' (T-Mobile USA)
     * network. Metering begins on the day of activation and ends on the same day of
     * the following month.  Max value is 2TB. Default value is `1000`..
     *
     * @param dataLimit Network-enforced limit specifying the total Megabytes of
     *                  data usage allowed during one month on the 'home' (T-Mobile
     *                  USA) network.
     * @return this
     */
    public RatePlanCreator setDataLimit(final Integer dataLimit) {
        this.dataLimit = dataLimit;
        return this;
    }

    /**
     * The model by which to meter data usage, in accordance with the available
     * [data metering
     * models](https://www.twilio.com/docs/wireless/api/rate-plan#payg-vs-quota-data-plans). Valid options are `payg` and `quota-1`, `quota-10`, and `quota-50`. Defaults to `payg`..
     *
     * @param dataMetering The model by which to meter data usage, in accordance
     *                     with the available data metering models.
     * @return this
     */
    public RatePlanCreator setDataMetering(final String dataMetering) {
        this.dataMetering = dataMetering;
        return this;
    }

    /**
     * Defines whether SIMs are capable of making and sending and receiving SMS
     * messages via either
     * [Commands](https://www.twilio.com/docs/wireless/api/commands) or Programmable
     * SMS APIs..
     *
     * @param messagingEnabled Defines whether SIMs are capable of making and
     *                         sending and receiving SMS messages via either
     *                         Commands or Programmable SMS APIs.
     * @return this
     */
    public RatePlanCreator setMessagingEnabled(final Boolean messagingEnabled) {
        this.messagingEnabled = messagingEnabled;
        return this;
    }

    /**
     * Defines whether SIMs are capable of making and receiving voice calls..
     *
     * @param voiceEnabled Defines whether SIMs are capable of making and receiving
     *                     voice calls.
     * @return this
     */
    public RatePlanCreator setVoiceEnabled(final Boolean voiceEnabled) {
        this.voiceEnabled = voiceEnabled;
        return this;
    }

    /**
     * Defines whether SIMs can roam onto networks other than the 'home' (T-Mobile
     * USA) network in the United States. See ['national'
     * roaming](https://www.twilio.com/docs/api/wireless/rest-api/rate-plan#national-roaming)..
     *
     * @param nationalRoamingEnabled Defines whether SIMs can roam onto networks
     *                               other than the 'home' (T-Mobile USA) network in
     *                               the United States.
     * @return this
     */
    public RatePlanCreator setNationalRoamingEnabled(final Boolean nationalRoamingEnabled) {
        this.nationalRoamingEnabled = nationalRoamingEnabled;
        return this;
    }

    /**
     * Defines whether SIMs are capable of using GPRS/3G/4G/LTE data connectivity
     * and messaging outside of the United States. Acceptable values are `data` and
     * `messaging`..
     *
     * @param internationalRoaming Defines whether SIMs are capable of using
     *                             GPRS/3G/4G/LTE data connectivity and messaging
     *                             outside of the United States.
     * @return this
     */
    public RatePlanCreator setInternationalRoaming(final List<String> internationalRoaming) {
        this.internationalRoaming = internationalRoaming;
        return this;
    }

    /**
     * Defines whether SIMs are capable of using GPRS/3G/4G/LTE data connectivity
     * and messaging outside of the United States. Acceptable values are `data` and
     * `messaging`..
     *
     * @param internationalRoaming Defines whether SIMs are capable of using
     *                             GPRS/3G/4G/LTE data connectivity and messaging
     *                             outside of the United States.
     * @return this
     */
    public RatePlanCreator setInternationalRoaming(final String internationalRoaming) {
        return setInternationalRoaming(Promoter.listOfOne(internationalRoaming));
    }

    /**
     * Network-enforced limit specifying the total Megabytes of national roaming
     * data usage (download and upload combined) allowed during one month on
     * networks in the United States other than the 'home' (T-Mobile USA) network.
     * See ['national'
     * roaming](https://www.twilio.com/docs/api/wireless/rest-api/rate-plan#national-roaming). Max value is 2TB..
     *
     * @param nationalRoamingDataLimit Network-enforced limit specifying the total
     *                                 Megabytes of data usage allowed during one
     *                                 month on networks in the United States other
     *                                 than the 'home' (T-Mobile USA) network.
     * @return this
     */
    public RatePlanCreator setNationalRoamingDataLimit(final Integer nationalRoamingDataLimit) {
        this.nationalRoamingDataLimit = nationalRoamingDataLimit;
        return this;
    }

    /**
     * Network-enforced limit specifying the total Megabytes of international
     * roaming (non-US) data usage (download and upload combined) allowed during one
     * month. Max value is 2TB. Default value is the lesser of `DataLimit` and
     * `1000`MB..
     *
     * @param internationalRoamingDataLimit Network-enforced limit specifying the
     *                                      total Megabytes of international roaming
     *                                      (non-US) data usage (download and upload
     *                                      combined) allowed during one month.
     * @return this
     */
    public RatePlanCreator setInternationalRoamingDataLimit(final Integer internationalRoamingDataLimit) {
        this.internationalRoamingDataLimit = internationalRoamingDataLimit;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created RatePlan
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public RatePlan create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.WIRELESS.toString(),
            "/v1/RatePlans",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("RatePlan creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return RatePlan.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (dataEnabled != null) {
            request.addPostParam("DataEnabled", dataEnabled.toString());
        }

        if (dataLimit != null) {
            request.addPostParam("DataLimit", dataLimit.toString());
        }

        if (dataMetering != null) {
            request.addPostParam("DataMetering", dataMetering);
        }

        if (messagingEnabled != null) {
            request.addPostParam("MessagingEnabled", messagingEnabled.toString());
        }

        if (voiceEnabled != null) {
            request.addPostParam("VoiceEnabled", voiceEnabled.toString());
        }

        if (nationalRoamingEnabled != null) {
            request.addPostParam("NationalRoamingEnabled", nationalRoamingEnabled.toString());
        }

        if (internationalRoaming != null) {
            for (String prop : internationalRoaming) {
                request.addPostParam("InternationalRoaming", prop);
            }
        }

        if (nationalRoamingDataLimit != null) {
            request.addPostParam("NationalRoamingDataLimit", nationalRoamingDataLimit.toString());
        }

        if (internationalRoamingDataLimit != null) {
            request.addPostParam("InternationalRoamingDataLimit", internationalRoamingDataLimit.toString());
        }
    }
}