.class public final Lo1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lo1/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lo1/j;
    .locals 1

    invoke-static {}, Lo1/j$a;->a()Lo1/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lo1/e;
    .locals 2

    invoke-static {}, Lo1/f;->d()Lo1/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Li1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/e;

    return-object v0
.end method


# virtual methods
.method public b()Lo1/e;
    .locals 1

    invoke-static {}, Lo1/j;->c()Lo1/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo1/j;->b()Lo1/e;

    move-result-object v0

    return-object v0
.end method
