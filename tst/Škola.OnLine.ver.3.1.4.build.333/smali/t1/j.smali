.class public final Lt1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Lt1/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lt1/j;
    .locals 1

    invoke-static {}, Lt1/j$a;->a()Lt1/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lt1/e;
    .locals 2

    invoke-static {}, Lt1/f;->d()Lt1/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Ln1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt1/e;

    return-object v0
.end method


# virtual methods
.method public b()Lt1/e;
    .locals 1

    invoke-static {}, Lt1/j;->c()Lt1/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt1/j;->b()Lt1/e;

    move-result-object v0

    return-object v0
.end method
