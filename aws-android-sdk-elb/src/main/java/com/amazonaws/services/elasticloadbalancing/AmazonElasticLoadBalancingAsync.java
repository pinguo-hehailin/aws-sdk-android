/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing AmazonElasticLoadBalancing asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Elastic Load Balancing <p>
 * Elastic Load Balancing distributes incoming traffic across your EC2
 * instances.
 * </p>
 * <p>
 * For information about the features of Elastic Load Balancing, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elastic-load-balancing.html"> What Is Elastic Load Balancing? </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 * <p>
 * For information about the AWS regions supported by Elastic Load
 * Balancing, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region"> Regions and Endpoints - Elastic Load Balancing </a>
 * in the <i>Amazon Web Services General Reference</i> .
 * </p>
 * <p>
 * All Elastic Load Balancing operations are <i>idempotent</i> , which
 * means that they complete at most one time. If you repeat an operation,
 * it succeeds with a 200 OK response code.
 * </p>
 */
public interface AmazonElasticLoadBalancingAsync extends AmazonElasticLoadBalancing {
    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the
     * descriptions of all policies created for the load balancer. If you
     * specify a policy name associated with your load balancer, the action
     * returns the description of that policy. If you don't specify a load
     * balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the
     * sample policies have the <code>ELBSample-</code> prefix.
     * </p>
     *
     * @param describeLoadBalancerPoliciesRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancerPolicies operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the
     * descriptions of all policies created for the load balancer. If you
     * specify a policy name associated with your load balancer, the action
     * returns the description of that policy. If you don't specify a load
     * balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the
     * sample policies have the <code>ELBSample-</code> prefix.
     * </p>
     *
     * @param describeLoadBalancerPoliciesRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancerPolicies operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicies service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest,
            AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This
     * policy must not be enabled for any listeners.
     * </p>
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest,
            AsyncHandler<DeleteLoadBalancerPolicyRequest, DeleteLoadBalancerPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with CreateLoadBalancerPolicy to
     * create policy configurations for a load balancer.
     * </p>
     *
     * @param describeLoadBalancerPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerPolicyTypes
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified load balancer policy types.
     * </p>
     * <p>
     * You can use these policy types with CreateLoadBalancerPolicy to
     * create policy configurations for a load balancer.
     * </p>
     *
     * @param describeLoadBalancerPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerPolicyTypes
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerPolicyTypes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest,
            AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override
     * the previously associated security groups.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-groups.html#elb-vpc-security-groups"> Security Groups for Load Balancers in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param applySecurityGroupsToLoadBalancerRequest Container for the
     *           necessary parameters to execute the ApplySecurityGroupsToLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one or more security groups with your load balancer in a
     * virtual private cloud (VPC). The specified security groups override
     * the previously associated security groups.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-groups.html#elb-vpc-security-groups"> Security Groups for Load Balancers in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param applySecurityGroupsToLoadBalancerRequest Container for the
     *           necessary parameters to execute the ApplySecurityGroupsToLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ApplySecurityGroupsToLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest,
            AsyncHandler<ApplySecurityGroupsToLoadBalancerRequest, ApplySecurityGroupsToLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes
     * controlled by the lifetime of the browser (user-agent) or a specified
     * expiration period. This policy can be associated only with HTTP/HTTPS
     * listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if
     * this cookie is present in the request. If so, the load balancer sends
     * the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based
     * on the existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent
     * requests from the same user to that server. The validity of the cookie
     * is based on the cookie expiration time, which is specified in the
     * policy configuration.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-duration"> Duration-Based Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes
     * controlled by the lifetime of the browser (user-agent) or a specified
     * expiration period. This policy can be associated only with HTTP/HTTPS
     * listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the back-end server instance for each request.
     * When the load balancer receives a request, it first checks to see if
     * this cookie is present in the request. If so, the load balancer sends
     * the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based
     * on the existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent
     * requests from the same user to that server. The validity of the cookie
     * is based on the cookie expiration time, which is specified in the
     * policy configuration.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-duration"> Duration-Based Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLBCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest,
            AsyncHandler<CreateLBCookieStickinessPolicyRequest, CreateLBCookieStickinessPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are
     * specified, the call describes all of your load balancers.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest,
            AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then,
     * the load balancer attempts to equally balance the traffic among its
     * remaining Availability Zones.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"> Disable an Availability Zone from a Load-Balanced Application </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. After an Availability Zone is removed, all
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <code>OutOfService</code> state. Then,
     * the load balancer attempts to equally balance the traffic among its
     * remaining Availability Zones.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"> Disable an Availability Zone from a Load-Balanced Application </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest,
            AsyncHandler<DisableAvailabilityZonesForLoadBalancerRequest, DisableAvailabilityZonesForLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"> Updating an SSL Certificate for a Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param setLoadBalancerListenerSSLCertificateRequest Container for the
     *           necessary parameters to execute the
     *           SetLoadBalancerListenerSSLCertificate operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBalancerListenerSSLCertificateAsync(SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html"> Updating an SSL Certificate for a Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param setLoadBalancerListenerSSLCertificateRequest Container for the
     *           necessary parameters to execute the
     *           SetLoadBalancerListenerSSLCertificate operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerListenerSSLCertificate service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBalancerListenerSSLCertificateAsync(SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest,
            AsyncHandler<SetLoadBalancerListenerSSLCertificateRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on
     * which the back-end server is listening with a new set of policies. At
     * this time, only the back-end server authentication policy type can be
     * applied to the back-end ports; this policy type is composed of
     * multiple public key policies.
     * </p>
     * <p>
     * Each time you use
     * <code>SetLoadBalancerPoliciesForBackendServer</code> to enable the
     * policies, use the <code>PolicyNames</code> parameter to list the
     * policies that you want to enable.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to
     * verify that the policy is associated with the back-end server.
     * </p>
     *
     * @param setLoadBalancerPoliciesForBackendServerRequest Container for
     *           the necessary parameters to execute the
     *           SetLoadBalancerPoliciesForBackendServer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on
     * which the back-end server is listening with a new set of policies. At
     * this time, only the back-end server authentication policy type can be
     * applied to the back-end ports; this policy type is composed of
     * multiple public key policies.
     * </p>
     * <p>
     * Each time you use
     * <code>SetLoadBalancerPoliciesForBackendServer</code> to enable the
     * policies, use the <code>PolicyNames</code> parameter to list the
     * policies that you want to enable.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to
     * verify that the policy is associated with the back-end server.
     * </p>
     *
     * @param setLoadBalancerPoliciesForBackendServerRequest Container for
     *           the necessary parameters to execute the
     *           SetLoadBalancerPoliciesForBackendServer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesForBackendServer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest,
            AsyncHandler<SetLoadBalancerPoliciesForBackendServerRequest, SetLoadBalancerPoliciesForBackendServerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the state of the specified instances with respect to the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances that are currently registered
     * with the load balancer. If instances are specified, their state is
     * returned even if they are no longer registered with the load balancer.
     * The state of terminated instances is not returned.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest describeInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the state of the specified instances with respect to the
     * specified load balancer. If no instances are specified, the call
     * describes the state of all instances that are currently registered
     * with the load balancer. If instances are specified, their state is
     * returned even if they are no longer registered with the load balancer.
     * The state of terminated instances is not returned.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest describeInstanceHealthRequest,
            AsyncHandler<DescribeInstanceHealthRequest, DescribeInstanceHealthResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     *
     * @param describeLoadBalancerAttributesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerAttributes
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     *
     * @param describeLoadBalancerAttributesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerAttributes
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the
     * same key is already associated with the load balancer,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/add-remove-tags.html"> Tag Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load
     * balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the
     * same key is already associated with the load balancer,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/add-remove-tags.html"> Tag Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates, updates, or disables a policy with a listener for the
     * specified load balancer. You can associate multiple policies with a
     * listener.
     * </p>
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBalancerPoliciesOfListener service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest,
            AsyncHandler<SetLoadBalancerPoliciesOfListenerRequest, SetLoadBalancerPoliciesOfListenerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its
     * registered Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"> Add Availability Zone </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability
     * Zones for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its
     * registered Availability Zones that contain instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"> Add Availability Zone </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest,
            AsyncHandler<EnableAvailabilityZonesForLoadBalancerRequest, EnableAvailabilityZonesForLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must
     * reconfigure all settings. The DNS name associated with a deleted load
     * balancer are no longer usable. The name and associated DNS record of
     * the deleted load balancer no longer exist and traffic sent to any of
     * its IP addresses is no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the
     * call to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must
     * reconfigure all settings. The DNS name associated with a deleted load
     * balancer are no longer usable. The name and associated DNS record of
     * the deleted load balancer no longer exist and traffic sent to any of
     * its IP addresses is no longer delivered to back-end instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the
     * call to <code>DeleteLoadBalancer</code> still succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            AsyncHandler<DeleteLoadBalancerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that
     * follow that of an application-generated cookie. This policy can be
     * associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * CreateLBCookieStickinessPolicy, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code> , follows
     * the lifetime of the application-generated cookie specified in the
     * policy configuration. The load balancer only inserts a new stickiness
     * cookie when the application response includes a new application
     * cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the
     * session stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-application"> Application-Controlled Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that
     * follow that of an application-generated cookie. This policy can be
     * associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * CreateLBCookieStickinessPolicy, except that the lifetime of the
     * special Elastic Load Balancing cookie, <code>AWSELB</code> , follows
     * the lifetime of the application-generated cookie specified in the
     * policy configuration. The load balancer only inserts a new stickiness
     * cookie when the application response includes a new application
     * cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the
     * session stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-sticky-sessions.html#enable-sticky-sessions-application"> Application-Controlled Session Stickiness </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAppCookieStickinessPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest,
            AsyncHandler<CreateAppCookieStickinessPolicyRequest, CreateAppCookieStickinessPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     *
     * @param deleteLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerListenersAsync(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     *
     * @param deleteLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerListenersAsync(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest,
            AsyncHandler<DeleteLoadBalancerListenersRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-manage-subnets.html"> Add or Remove Subnets for Your Load Balancer in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param attachLoadBalancerToSubnetsRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancerToSubnets operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the
     * specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered
     * subnets. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-manage-subnets.html"> Add or Remove Subnets for Your Load Balancer in a VPC </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param attachLoadBalancerToSubnetsRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancerToSubnets operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachLoadBalancerToSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest,
            AsyncHandler<AttachLoadBalancerToSubnetsRequest, AttachLoadBalancerToSubnetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created
     * with a unique Domain Name Service (DNS) name. The load balancer
     * receives incoming traffic and routes it to the registered instances.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/how-elb-works.html"> How Elastic Load Balancing Works </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You
     * can request an increase for the number of load balancers for your
     * account. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"> Elastic Load Balancing Limits </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a load balancer.
     * </p>
     * <p>
     * If the call completes successfully, a new load balancer is created
     * with a unique Domain Name Service (DNS) name. The load balancer
     * receives incoming traffic and routes it to the registered instances.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/how-elb-works.html"> How Elastic Load Balancing Works </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You
     * can request an increase for the number of load balancers for your
     * account. For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"> Elastic Load Balancing Limits </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest,
            AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code> , <code>ConnectionDraining</code> , and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling
     * them. Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection
     * timeout value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load
     * Balancing Developer Guide</i> :
     * </p>
     * 
     * <ul>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"> Cross-Zone Load Balancing </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"> Connection Draining </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"> Access Logs </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"> Idle Connection Timeout </a>
     * </li>
     * 
     * </ul>
     *
     * @param modifyLoadBalancerAttributesRequest Container for the necessary
     *           parameters to execute the ModifyLoadBalancerAttributes operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as
     * <code>AccessLogs</code> , <code>ConnectionDraining</code> , and
     * <code>CrossZoneLoadBalancing</code> by either enabling or disabling
     * them. Or, you can modify the load balancer attribute
     * <code>ConnectionSettings</code> by specifying an idle connection
     * timeout value for your load balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Elastic Load
     * Balancing Developer Guide</i> :
     * </p>
     * 
     * <ul>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#request-routing"> Cross-Zone Load Balancing </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"> Connection Draining </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"> Access Logs </a>
     * </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#idle-timeout"> Idle Connection Timeout </a>
     * </li>
     * 
     * </ul>
     *
     * @param modifyLoadBalancerAttributesRequest Container for the necessary
     *           parameters to execute the ModifyLoadBalancerAttributes operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLoadBalancerAttributes service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is
     * created; otherwise, the properties of the new listener must match the
     * properties of the existing listener.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"> Add a Listener to Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLoadBalancerListenersAsync(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more listeners for the specified load balancer. If a
     * listener with the specified port does not already exist, it is
     * created; otherwise, the properties of the new listener must match the
     * properties of the existing listener.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html"> Add a Listener to Your Load Balancer </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerListeners operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerListeners service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLoadBalancerListenersAsync(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest,
            AsyncHandler<CreateLoadBalancerListenersRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that
     * can be applied to the front-end listener or the back-end application
     * server, depending on the policy type.
     * </p>
     *
     * @param createLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load
     * balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that
     * can be applied to the front-end listener or the back-end application
     * server, depending on the policy type.
     * </p>
     *
     * @param createLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerPolicy operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancerPolicy service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest,
            AsyncHandler<CreateLoadBalancerPolicyRequest, CreateLoadBalancerPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the
     * load balancer (EC2-Classic or the same VPC). If you have EC2-Classic
     * instances and a load balancer in a VPC with ClassicLink enabled, you
     * can link the EC2-Classic instances to that VPC and then register the
     * linked EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes
     * when the request has been registered. Instance registration takes a
     * little time to complete. To check the state of the registered
     * instances, use DescribeLoadBalancers or DescribeInstanceHealth.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of
     * the Availability Zones registered for the load balancer is moved to
     * the <code>OutOfService</code> state. If an Availability Zone is added
     * to the load balancer later, any instances registered with the load
     * balancer move to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then
     * start it, the IP addresses associated with the instance changes.
     * Elastic Load Balancing cannot recognize the new IP address, which
     * prevents it from routing traffic to the instances. We recommend that
     * you use the following sequence: stop the instance, deregister the
     * instance, start the instance, and then register the instance. To
     * deregister instances from a load balancer, use
     * DeregisterInstancesFromLoadBalancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the
     * load balancer (EC2-Classic or the same VPC). If you have EC2-Classic
     * instances and a load balancer in a VPC with ClassicLink enabled, you
     * can link the EC2-Classic instances to that VPC and then register the
     * linked EC2-Classic instances with the load balancer in the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes
     * when the request has been registered. Instance registration takes a
     * little time to complete. To check the state of the registered
     * instances, use DescribeLoadBalancers or DescribeInstanceHealth.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in one of
     * the Availability Zones registered for the load balancer is moved to
     * the <code>OutOfService</code> state. If an Availability Zone is added
     * to the load balancer later, any instances registered with the load
     * balancer move to the <code>InService</code> state.
     * </p>
     * <p>
     * If you stop an instance registered with a load balancer and then
     * start it, the IP addresses associated with the instance changes.
     * Elastic Load Balancing cannot recognize the new IP address, which
     * prevents it from routing traffic to the instances. We recommend that
     * you use the following sequence: stop the instance, deregister the
     * instance, start the instance, and then register the instance. To
     * deregister instances from a load balancer, use
     * DeregisterInstancesFromLoadBalancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest,
            AsyncHandler<RegisterInstancesWithLoadBalancerRequest, RegisterInstancesWithLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for
     * the load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the
     * remaining routable subnets.
     * </p>
     *
     * @param detachLoadBalancerFromSubnetsRequest Container for the
     *           necessary parameters to execute the DetachLoadBalancerFromSubnets
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified subnets from the set of configured subnets for
     * the load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load
     * balancer in the removed subnet go into the <code>OutOfService</code>
     * state. Then, the load balancer balances the traffic among the
     * remaining routable subnets.
     * </p>
     *
     * @param detachLoadBalancerFromSubnetsRequest Container for the
     *           necessary parameters to execute the DetachLoadBalancerFromSubnets
     *           operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachLoadBalancerFromSubnets service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest,
            AsyncHandler<DetachLoadBalancerFromSubnetsRequest, DetachLoadBalancerFromSubnetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register Amazon EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer.
     * After the instance is deregistered, it no longer receives traffic from
     * the load balancer.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers to verify that the instance is
     * deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> Deregister and Register Amazon EC2 Instances </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest,
            AsyncHandler<DeregisterInstancesFromLoadBalancerRequest, DeregisterInstancesFromLoadBalancerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-healthchecks.html"> Configure Health Checks </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest configureHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-healthchecks.html"> Configure Health Checks </a>
     * in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck operation on
     *           AmazonElasticLoadBalancing.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by
     *         AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest configureHealthCheckRequest,
            AsyncHandler<ConfigureHealthCheckRequest, ConfigureHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        