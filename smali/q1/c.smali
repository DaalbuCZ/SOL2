.class public final Lq1/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq1/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lq1/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lq1/c;
    .locals 1

    invoke-static {}, Lq1/c$a;->a()Lq1/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lq1/a;
    .locals 2

    invoke-static {}, Lq1/b;->a()Lq1/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Li1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/a;

    return-object v0
.end method


# virtual methods
.method public c()Lq1/a;
    .locals 1

    invoke-static {}, Lq1/c;->b()Lq1/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq1/c;->c()Lq1/a;

    move-result-object v0

    return-object v0
.end method