package com.github.searls.jasmine.io.scripts;

import java.io.IOException;
import java.util.Set;

public interface ScriptResolver {

	void resolveScripts() throws IOException;

	Set<String> getPreloads();

	Set<String> getSources();

	Set<String> getSpecs();

	Set<String> getAllScripts();

	String getSourceDirectory();

	String getSpecDirectoryPath();

	Set<String> getSourcesRelativePath() throws IOException;

	Set<String> getSpecsRelativePath() throws IOException;

	Set<String> getPreloadsRelativePath() throws IOException;

	Set<String> getAllScriptsRelativePath() throws IOException;

	String getSourceDirectoryRelativePath() throws IOException;

	String getSpecDirectoryRelativePath() throws IOException;
}
