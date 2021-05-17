/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.bulkexports.v1.export;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class ExportCustomJobCreator extends Creator<ExportCustomJob> {
    private final String pathResourceType;
    private final String startDay;
    private final String endDay;
    private final String friendlyName;
    private String webhookUrl;
    private String webhookMethod;
    private String email;

    /**
     * Construct a new ExportCustomJobCreator.
     *
     * @param pathResourceType The type of communication – Messages or Calls,
     *                         Conferences, and Participants
     * @param startDay The start day for the custom export specified as a string in
     *                 the format of yyyy-mm-dd
     * @param endDay The end day for the custom export specified as a string in the
     *               format of yyyy-mm-dd. End day is inclusive and must be 2 days
     *               earlier than the current UTC day.
     * @param friendlyName The friendly name specified when creating the job
     */
    public ExportCustomJobCreator(final String pathResourceType,
                                  final String startDay,
                                  final String endDay,
                                  final String friendlyName) {
        this.pathResourceType = pathResourceType;
        this.startDay = startDay;
        this.endDay = endDay;
        this.friendlyName = friendlyName;
    }

    /**
     * The optional webhook url called on completion of the job. If this is
     * supplied, `WebhookMethod` must also be supplied. If you set neither webhook
     * nor email, you will have to check your job's status manually..
     *
     * @param webhookUrl The optional webhook url called on completion of the job.
     *                   If this is supplied, `WebhookMethod` must also be supplied.
     * @return this
     */
    public ExportCustomJobCreator setWebhookUrl(final String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * This is the method used to call the webhook on completion of the job. If this
     * is supplied, `WebhookUrl` must also be supplied..
     *
     * @param webhookMethod This is the method used to call the webhook on
     *                      completion of the job. If this is supplied, `WebhookUrl`
     *                      must also be supplied.
     * @return this
     */
    public ExportCustomJobCreator setWebhookMethod(final String webhookMethod) {
        this.webhookMethod = webhookMethod;
        return this;
    }

    /**
     * The optional email to send the completion notification to. You can set both
     * webhook, and email, or one or the other. If you set neither, the job will run
     * but you will have to query to determine your job's status..
     *
     * @param email The optional email to send the completion notification to
     * @return this
     */
    public ExportCustomJobCreator setEmail(final String email) {
        this.email = email;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created ExportCustomJob
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public ExportCustomJob create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.BULKEXPORTS.toString(),
            "/v1/Exports/" + this.pathResourceType + "/Jobs"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ExportCustomJob creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ExportCustomJob.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (startDay != null) {
            request.addPostParam("StartDay", startDay);
        }

        if (endDay != null) {
            request.addPostParam("EndDay", endDay);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (webhookUrl != null) {
            request.addPostParam("WebhookUrl", webhookUrl);
        }

        if (webhookMethod != null) {
            request.addPostParam("WebhookMethod", webhookMethod);
        }

        if (email != null) {
            request.addPostParam("Email", email);
        }
    }
}