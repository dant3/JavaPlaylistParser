JavaPlaylistParser
============================

Origin project page <a href="https://github.com/wseemann/JavaPlaylistParser">here</a>.

Donate
------------

Donations to origin project can be made via PayPal:

<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=4KK2RERB2VKL8" alt="PayPal - The safer, easier way to pay online!">
  <img src="https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif">
</a>

Overview
--------

JavaPlaylistParser is a toolkit for detecting and extracting metadata and structured text content from various documents using existing parser libraries.

Android support: added support for read timeout as it does not throw exception when was parsing stream instead of playlist
	(ex. http://s3.mediastreaming.it:7100/;stream.nsv/listen.pls is a stream, but contain .pls so it is considered as playlist)

Using JPP in your application
------------

Extract and copy the following JAR file and prebuilt native libraries into your projects "libs" folder:

Installation
------------

### Ant

Java Playlist Parser is based on Java 6 and uses the Apache Ant <http://ant.apache.org/>
build system. To build Java Playlist sParser, use the following command in this directory:

    ant jar

Usage
------------



License
------------

```
JavaPlaylistParser: A toolkit for detecting and extracting metadata and structured text content from various documents using existing parser libraries.

Copyright 2014 William Seemann
Copyright 2015 V-master

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

