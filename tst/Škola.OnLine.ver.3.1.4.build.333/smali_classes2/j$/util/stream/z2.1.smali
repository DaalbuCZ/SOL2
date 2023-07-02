.class abstract synthetic Lj$/util/stream/z2;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lj$/time/a;->a()[I

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lj$/util/stream/z2;->a:[I

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v1}, Lj$/time/format/A;->c(I)I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lj$/util/stream/z2;->a:[I

    const/4 v1, 0x2

    invoke-static {v1}, Lj$/time/format/A;->c(I)I

    move-result v2

    aput v1, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lj$/util/stream/z2;->a:[I

    const/4 v1, 0x3

    invoke-static {v1}, Lj$/time/format/A;->c(I)I

    move-result v2

    aput v1, v0, v2
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lj$/util/stream/z2;->a:[I

    const/4 v1, 0x4

    invoke-static {v1}, Lj$/time/format/A;->c(I)I

    move-result v2

    aput v1, v0, v2
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
