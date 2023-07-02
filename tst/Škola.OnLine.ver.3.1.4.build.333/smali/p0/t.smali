.class public abstract Lp0/t;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AddedAbstractMethod"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lp0/t;
    .locals 0

    invoke-static {p0}, Lq0/i;->k(Landroid/content/Context;)Lq0/i;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, Lq0/i;->f(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lp0/m;
.end method

.method public abstract b(Ljava/util/UUID;)Lp0/m;
.end method

.method public abstract c(Ljava/util/List;)Lp0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lp0/u;",
            ">;)",
            "Lp0/m;"
        }
    .end annotation
.end method

.method public final d(Lp0/u;)Lp0/m;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp0/t;->c(Ljava/util/List;)Lp0/m;

    move-result-object p1

    return-object p1
.end method
