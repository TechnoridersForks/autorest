/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Enums.
 */
public interface Enums {
    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Colors object if successful.
     */
    Colors getNotExpandable();

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Colors> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback);

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Colors object
     */
    Observable<Colors> getNotExpandableAsync();

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Colors object
     */
    Observable<ServiceResponse<Colors>> getNotExpandableWithServiceResponseAsync();

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putNotExpandable(Colors stringBody);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putNotExpandableAsync(Colors stringBody);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putNotExpandableWithServiceResponseAsync(Colors stringBody);

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Colors object if successful.
     */
    Colors getReferenced();

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Colors> getReferencedAsync(final ServiceCallback<Colors> serviceCallback);

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Colors object
     */
    Observable<Colors> getReferencedAsync();

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Colors object
     */
    Observable<ServiceResponse<Colors>> getReferencedWithServiceResponseAsync();

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putReferenced(Colors enumStringBody);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putReferencedAsync(Colors enumStringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putReferencedAsync(Colors enumStringBody);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putReferencedWithServiceResponseAsync(Colors enumStringBody);

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RefColorConstant object if successful.
     */
    RefColorConstant getReferencedConstant();

    /**
     * Get value 'green-color' from the constant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RefColorConstant> getReferencedConstantAsync(final ServiceCallback<RefColorConstant> serviceCallback);

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefColorConstant object
     */
    Observable<RefColorConstant> getReferencedConstantAsync();

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefColorConstant object
     */
    Observable<ServiceResponse<RefColorConstant>> getReferencedConstantWithServiceResponseAsync();

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putReferencedConstant(RefColorConstant enumStringBody);

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putReferencedConstantAsync(RefColorConstant enumStringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> putReferencedConstantAsync(RefColorConstant enumStringBody);

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putReferencedConstantWithServiceResponseAsync(RefColorConstant enumStringBody);

}
