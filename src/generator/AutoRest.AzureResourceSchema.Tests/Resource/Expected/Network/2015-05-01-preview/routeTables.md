# Microsoft.Network/routeTables template reference
API Version: 2015-05-01-preview
## Template format

To create a Microsoft.Network/routeTables resource, add the following JSON to the resources section of your template.

```json
{
  "name": "string",
  "type": "Microsoft.Network/routeTables",
  "apiVersion": "2015-05-01-preview",
  "location": "string",
  "tags": {},
  "properties": {
    "routes": [
      {
        "id": "string",
        "properties": {
          "addressPrefix": "string",
          "nextHopType": "string",
          "nextHopIpAddress": "string",
          "provisioningState": "string"
        },
        "name": "string",
        "etag": "string"
      }
    ],
    "subnets": [
      {
        "id": "string"
      }
    ],
    "provisioningState": "string"
  },
  "etag": "string",
  "resources": [
    null
  ]
}
```
## Property values

The following tables describe the values you need to set in the schema.

<a id="Microsoft.Network/routeTables" />
### Microsoft.Network/routeTables object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  name | string | Yes |  |
|  type | enum | Yes | Microsoft.Network/routeTables |
|  apiVersion | enum | Yes | 2015-05-01-preview |
|  location | string | Yes | Resource location |
|  tags | object | No | Resource tags |
|  properties | object | Yes | [RouteTablePropertiesFormat object](#RouteTablePropertiesFormat) |
|  etag | string | No | Gets a unique read-only string that changes whenever the resource is updated |
|  resources | array | No | [routeTables_routes_childResource object](#routeTables_routes_childResource) |


<a id="RouteTablePropertiesFormat" />
### RouteTablePropertiesFormat object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  routes | array | No | Gets or sets Routes in a Route Table - [Route object](#Route) |
|  subnets | array | No | Gets collection of references to subnets - [SubResource object](#SubResource) |
|  provisioningState | string | No | Gets or sets Provisioning state of the resource Updating/Deleting/Failed |


<a id="routeTables_routes_childResource" />
### routeTables_routes_childResource object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  name | string | Yes |  |
|  type | enum | Yes | routes |
|  apiVersion | enum | Yes | 2015-05-01-preview |
|  id | string | No | Resource Id |
|  properties | object | Yes | [RoutePropertiesFormat object](#RoutePropertiesFormat) |
|  etag | string | No | A unique read-only string that changes whenever the resource is updated |


<a id="Route" />
### Route object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  id | string | No | Resource Id |
|  properties | object | No | [RoutePropertiesFormat object](#RoutePropertiesFormat) |
|  name | string | No | Gets name of the resource that is unique within a resource group. This name can be used to access the resource |
|  etag | string | No | A unique read-only string that changes whenever the resource is updated |


<a id="SubResource" />
### SubResource object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  id | string | No | Resource Id |


<a id="RoutePropertiesFormat" />
### RoutePropertiesFormat object
|  Name | Type | Required | Value |
|  ---- | ---- | ---- | ---- |
|  addressPrefix | string | No | Gets or sets the destination CIDR to which the route applies. |
|  nextHopType | enum | Yes | Gets or sets the type of Azure hop the packet should be sent to. - VirtualNetworkGateway, VnetLocal, Internet, VirtualAppliance, None |
|  nextHopIpAddress | string | No | Gets or sets the IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance. |
|  provisioningState | string | No | Gets or sets Provisioning state of the resource Updating/Deleting/Failed |

