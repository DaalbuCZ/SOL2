.class public abstract Lk0/t;
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

.method public static e(Landroid/content/Context;)Lk0/t;
    .locals 0

    invoke-static {p0}, Ll0/i;->k(Landroid/content/Context;)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, Ll0/i;->f(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lk0/m;
.end method

.method public abstract b(Ljava/util/UUID;)Lk0/m;
.end method

.method public abstract c(Ljava/util/List;)Lk0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lk0/u;",
            ">;)",
            "Lk0/m;"
        }
    .end annotation
.end method

.method public final d(Lk0/u;)Lk0/m;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk0/t;->c(Ljava/util/List;)Lk0/m;

    move-result-object p1

    return-object p1
.end method
