/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service.entity.challenge;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Notification extends Resource {
    private static final long serialVersionUID = 58087406399871L;

    /**
     * Create a NotificationCreator to execute create.
     *
     * @param pathServiceSid Service Sid.
     * @param pathIdentity Unique external identifier of the Entity
     * @param pathChallengeSid Challenge Sid.
     * @return NotificationCreator capable of executing the create
     */
    public static NotificationCreator creator(final String pathServiceSid,
                                              final String pathIdentity,
                                              final String pathChallengeSid) {
        return new NotificationCreator(pathServiceSid, pathIdentity, pathChallengeSid);
    }

    /**
     * Converts a JSON String into a Notification object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Notification object represented by the provided JSON
     */
    public static Notification fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Notification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Notification object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Notification object represented by the provided JSON
     */
    public static Notification fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Notification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String entitySid;
    private final String identity;
    private final String challengeSid;
    private final String priority;
    private final Integer ttl;
    private final ZonedDateTime dateCreated;

    @JsonCreator
    private Notification(@JsonProperty("sid")
                         final String sid,
                         @JsonProperty("account_sid")
                         final String accountSid,
                         @JsonProperty("service_sid")
                         final String serviceSid,
                         @JsonProperty("entity_sid")
                         final String entitySid,
                         @JsonProperty("identity")
                         final String identity,
                         @JsonProperty("challenge_sid")
                         final String challengeSid,
                         @JsonProperty("priority")
                         final String priority,
                         @JsonProperty("ttl")
                         final Integer ttl,
                         @JsonProperty("date_created")
                         final String dateCreated) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.entitySid = entitySid;
        this.identity = identity;
        this.challengeSid = challengeSid;
        this.priority = priority;
        this.ttl = ttl;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
    }

    /**
     * Returns A string that uniquely identifies this Notification..
     *
     * @return A string that uniquely identifies this Notification.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns Account Sid..
     *
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns Service Sid..
     *
     * @return Service Sid.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns Entity Sid..
     *
     * @return Entity Sid.
     */
    public final String getEntitySid() {
        return this.entitySid;
    }

    /**
     * Returns Unique external identifier of the Entity.
     *
     * @return Unique external identifier of the Entity
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns Challenge Sid..
     *
     * @return Challenge Sid.
     */
    public final String getChallengeSid() {
        return this.challengeSid;
    }

    /**
     * Returns The priority of the Notification..
     *
     * @return The priority of the Notification.
     */
    public final String getPriority() {
        return this.priority;
    }

    /**
     * Returns How long, in seconds, the Notification is valid..
     *
     * @return How long, in seconds, the Notification is valid.
     */
    public final Integer getTtl() {
        return this.ttl;
    }

    /**
     * Returns The date this Notification was created.
     *
     * @return The date this Notification was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Notification other = (Notification) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(entitySid, other.entitySid) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(challengeSid, other.challengeSid) &&
               Objects.equals(priority, other.priority) &&
               Objects.equals(ttl, other.ttl) &&
               Objects.equals(dateCreated, other.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            entitySid,
                            identity,
                            challengeSid,
                            priority,
                            ttl,
                            dateCreated);
    }
}