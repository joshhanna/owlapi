/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. KRSSParserConstants.java */
package org.semanticweb.owlapi.krss1.parser;

interface KRSSParserConstants {

    int EOF = 0;
    int COMMENT_START = 5;
    int IRI_START = 8;
    int IRI_END = 9;
    int STRING_LITERAL_START = 11;
    int STRINGLITERAL = 13;
    int OPENPAR = 15;
    int CLOSEPAR = 16;
    int ENDTBOX = 17;
    int ENDABOX = 18;
    int PRIMITIVECONCEPT = 19;
    int DEFINEPRIMITIVECONCEPT = 20;
    int DEFINECONCEPT = 21;
    int DEFINEPRIMITIVEROLE = 22;
    int SUBROLE = 23;
    int TRANSITIVE = 24;
    int ENUM = 25;
    int RANGE = 26;
    int AND = 27;
    int OR = 28;
    int NOT = 29;
    int ALL = 30;
    int SOME = 31;
    int NONE = 32;
    int ATLEAST = 33;
    int ATMOST = 34;
    int EXACTLY = 35;
    int INSTANCE = 36;
    int RELATED = 37;
    int EQUAL = 38;
    int DISTINCT = 39;
    int NAME = 40;
    int INT = 41;
    int DEFAULT = 0;
    int IN_COMMENT = 1;
    int IN_IRI = 2;
    int IN_STRING_LITERAL = 3;
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\n\"", "\"\\t\"", "\"\\r\"",
            "\";\"", "\"\\n\"", "<token of kind 7>", "\"<\"", "\">\"",
            "<token of kind 10>", "\"\\\"\"", "\"\\\\\\\"\"", "\"\\\"\"",
            "<token of kind 14>", "\"(\"", "\")\"", "\"end-tbox\"",
            "\"end-abox\"", "\"primitive-concept\"",
            "\"define-primitive-concept\"", "\"define-concept\"",
            "\"define-primitive-role\"", "\"subrole\"", "\"transitive\"",
            "\"enum\"", "\"range\"", "\"and\"", "\"or\"", "\"not\"", "\"all\"",
            "\"some\"", "\"none\"", "\"at-least\"", "\"at-most\"",
            "\"exactly\"", "\"instance\"", "\"related\"", "\"equal\"",
            "\"distinct\"", "<NAME>", "<INT>", "\":right-identity\"", };
}
