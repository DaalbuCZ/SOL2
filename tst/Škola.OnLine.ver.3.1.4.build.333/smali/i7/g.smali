.class public Li7/g;
.super Li7/f;
.source ""


# instance fields
.field private final n:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    const-string v0, "Fetch was throttled."

    invoke-direct {p0, v0, p1, p2}, Li7/g;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1}, Li7/f;-><init>(Ljava/lang/String;)V

    iput-wide p2, p0, Li7/g;->n:J

    return-void
.end method
