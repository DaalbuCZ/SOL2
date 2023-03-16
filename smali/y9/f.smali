.class public abstract Ly9/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ly9/d;[B)Ly9/f;
    .locals 2
    .param p0    # Ly9/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Ly9/f;->b(Ly9/d;[BII)Ly9/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ly9/d;[BII)Ly9/f;
    .locals 7
    .param p0    # Ly9/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "content == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lz9/a;->b(JJJ)V

    new-instance v0, Ly9/f$a;

    invoke-direct {v0, p0, p3, p1, p2}, Ly9/f$a;-><init>(Ly9/d;I[BI)V

    return-object v0
.end method
