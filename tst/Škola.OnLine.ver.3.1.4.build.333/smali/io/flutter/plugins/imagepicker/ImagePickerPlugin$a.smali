.class synthetic Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/ImagePickerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lio/flutter/plugins/imagepicker/g$l;->values()[Lio/flutter/plugins/imagepicker/g$l;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->b:[I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lio/flutter/plugins/imagepicker/g$l;->p:Lio/flutter/plugins/imagepicker/g$l;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x2

    :try_start_1
    sget-object v2, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->b:[I

    sget-object v3, Lio/flutter/plugins/imagepicker/g$l;->o:Lio/flutter/plugins/imagepicker/g$l;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    invoke-static {}, Lio/flutter/plugins/imagepicker/g$j;->values()[Lio/flutter/plugins/imagepicker/g$j;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->a:[I

    :try_start_2
    sget-object v3, Lio/flutter/plugins/imagepicker/g$j;->p:Lio/flutter/plugins/imagepicker/g$j;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->a:[I

    sget-object v2, Lio/flutter/plugins/imagepicker/g$j;->o:Lio/flutter/plugins/imagepicker/g$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
