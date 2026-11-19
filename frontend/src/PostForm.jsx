
import React, { useActionState } from 'react';
import SubmitButton from './SubmitButton';
import api from './api';

const PostForm = () => {

    const submitAction = async (prevState, formData) => {

        const title = formData.get("title")?.trim();
        const content = formData.get("content")?.trim();

        if (!title || !content) {
            return {
                error: "Title and content are required",
                msg: ""
            };
        }

        try {

            await api.post("/posts", {
                title,
                content
            });

            return {
                error: null,
                msg: "Your post was created successfully!"
            };

        } catch (error) {

            console.error("Post error:", error.response?.data || error);

            return {
                error:
                    error.response?.data?.message ||
                    "Something went wrong. Please try again.",
                msg: ""
            };
        }
    };

    const [state, formAction] = useActionState(
        submitAction,
        {
            error: null,
            msg: ""
        }
    );

    return (

        <div className="bg-white max-w-2xl mx-auto p-8 rounded-2xl shadow-lg">

            <div className="mb-7">

                <h2 className="text-2xl font-bold text-slate-800">
                    Create a New Post
                </h2>

                <p className="text-slate-500 text-sm mt-2">
                    Share your thoughts with the community.
                </p>

            </div>

            <form action={formAction} className="space-y-5">

                {state.error && (
                    <div className="bg-red-50 text-red-700 border border-red-200 p-3 rounded-lg text-sm">
                        {state.error}
                    </div>
                )}

                {state.msg && (
                    <div className="bg-green-50 text-green-700 border border-green-200 p-3 rounded-lg text-sm">
                        {state.msg}
                    </div>
                )}

                <div>

                    <label className="block font-semibold text-slate-700 mb-2">
                        Post Title
                    </label>

                    <input
                        type="text"
                        name="title"
                        placeholder="Give your post a title"
                        required
                        className="w-full border border-slate-300 rounded-lg p-3 outline-none focus:ring-2 focus:ring-blue-500"
                    />

                </div>

                <div>

                    <label className="block font-semibold text-slate-700 mb-2">
                        Content
                    </label>

                    <textarea
                        name="content"
                        placeholder="What would you like to share?"
                        rows="6"
                        required
                        className="w-full border border-slate-300 rounded-lg p-3 outline-none focus:ring-2 focus:ring-blue-500 resize-none"
                    />

                </div>

                <SubmitButton label="Publish Post" />

            </form>

        </div>
    );
};

export default PostForm;
