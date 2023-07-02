.class public final Lv1/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv1/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Lv1/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lv1/c;
    .locals 1

    invoke-static {}, Lv1/c$a;->a()Lv1/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lv1/a;
    .locals 2

    invoke-static {}, Lv1/b;->a()Lv1/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Ln1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv1/a;

    return-object v0
.end method


# virtual methods
.method public c()Lv1/a;
    .locals 1

    invoke-static {}, Lv1/c;->b()Lv1/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv1/c;->c()Lv1/a;

    move-result-object v0

    return-object v0
.end method
