/* 
 * BitMEX API
 *
 * REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace IO.Swagger.Model
{
    /// <summary>
    /// InstrumentInterval
    /// </summary>
    [DataContract]
    public partial class InstrumentInterval :  IEquatable<InstrumentInterval>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstrumentInterval" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InstrumentInterval() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InstrumentInterval" /> class.
        /// </summary>
        /// <param name="Intervals">Intervals (required).</param>
        /// <param name="Symbols">Symbols (required).</param>
        public InstrumentInterval(List<string> Intervals = null, List<string> Symbols = null)
        {
            // to ensure "Intervals" is required (not null)
            if (Intervals == null)
            {
                throw new InvalidDataException("Intervals is a required property for InstrumentInterval and cannot be null");
            }
            else
            {
                this.Intervals = Intervals;
            }
            // to ensure "Symbols" is required (not null)
            if (Symbols == null)
            {
                throw new InvalidDataException("Symbols is a required property for InstrumentInterval and cannot be null");
            }
            else
            {
                this.Symbols = Symbols;
            }
        }
        
        /// <summary>
        /// Gets or Sets Intervals
        /// </summary>
        [DataMember(Name="intervals", EmitDefaultValue=false)]
        public List<string> Intervals { get; set; }
        /// <summary>
        /// Gets or Sets Symbols
        /// </summary>
        [DataMember(Name="symbols", EmitDefaultValue=false)]
        public List<string> Symbols { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InstrumentInterval {\n");
            sb.Append("  Intervals: ").Append(Intervals).Append("\n");
            sb.Append("  Symbols: ").Append(Symbols).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as InstrumentInterval);
        }

        /// <summary>
        /// Returns true if InstrumentInterval instances are equal
        /// </summary>
        /// <param name="other">Instance of InstrumentInterval to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstrumentInterval other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Intervals == other.Intervals ||
                    this.Intervals != null &&
                    this.Intervals.SequenceEqual(other.Intervals)
                ) && 
                (
                    this.Symbols == other.Symbols ||
                    this.Symbols != null &&
                    this.Symbols.SequenceEqual(other.Symbols)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Intervals != null)
                    hash = hash * 59 + this.Intervals.GetHashCode();
                if (this.Symbols != null)
                    hash = hash * 59 + this.Symbols.GetHashCode();
                return hash;
            }
        }
    }

}
