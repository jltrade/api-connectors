# coding: utf-8

"""
    BitMEX API

    REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>

    OpenAPI spec version: 1.2.0
    Contact: support@bitmex.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from pprint import pformat
from six import iteritems
import re


class InstrumentInterval(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, intervals=None, symbols=None):
        """
        InstrumentInterval - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'intervals': 'list[str]',
            'symbols': 'list[str]'
        }

        self.attribute_map = {
            'intervals': 'intervals',
            'symbols': 'symbols'
        }

        self._intervals = intervals
        self._symbols = symbols

    @property
    def intervals(self):
        """
        Gets the intervals of this InstrumentInterval.


        :return: The intervals of this InstrumentInterval.
        :rtype: list[str]
        """
        return self._intervals

    @intervals.setter
    def intervals(self, intervals):
        """
        Sets the intervals of this InstrumentInterval.


        :param intervals: The intervals of this InstrumentInterval.
        :type: list[str]
        """

        self._intervals = intervals

    @property
    def symbols(self):
        """
        Gets the symbols of this InstrumentInterval.


        :return: The symbols of this InstrumentInterval.
        :rtype: list[str]
        """
        return self._symbols

    @symbols.setter
    def symbols(self, symbols):
        """
        Sets the symbols of this InstrumentInterval.


        :param symbols: The symbols of this InstrumentInterval.
        :type: list[str]
        """

        self._symbols = symbols

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
