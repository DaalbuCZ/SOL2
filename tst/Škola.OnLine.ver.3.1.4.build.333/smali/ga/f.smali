.class public abstract Lga/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lga/d;[B)Lga/f;
    .locals 2
    .param p0    # Lga/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lga/f;->b(Lga/d;[BII)Lga/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lga/d;[BII)Lga/f;
    .locals 7
    .param p0    # Lga/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "content == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lha/a;->b(JJJ)V

    new-instance v0, Lga/f$a;

    invoke-direct {v0, p0, p3, p1, p2}, Lga/f$a;-><init>(Lga/d;I[BI)V

    return-object v0
.end method
