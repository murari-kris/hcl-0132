
import React from 'react';
import { useFormStatus } from 'react-dom';

const SubmitButton = () => {
    const { pending } = useFormStatus();

    return (
        <button
            type="submit"
            disabled={pending}
            className={`
                w-full flex items-center justify-center gap-2
                bg-blue-600 text-white font-semibold
                py-3 px-6 rounded-lg
                hover:bg-blue-700
                transition-all duration-300
                shadow-md hover:shadow-lg
                disabled:opacity-60
                disabled:cursor-not-allowed
            `}
        >
            {pending ? (
                <>
                    <span className="w-5 h-5 border-2 border-white border-t-transparent rounded-full animate-spin"></span>
                    Submitting Securely...
                </>
            ) : (
                "Submit"
            )}
        </button>
    );
};

export default SubmitButton;
