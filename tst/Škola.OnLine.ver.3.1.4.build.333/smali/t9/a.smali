.class public abstract Lt9/a;
.super Lt9/c;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt9/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    invoke-virtual {p0}, Lt9/a;->c()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public abstract c()Ljava/util/Random;
.end method
