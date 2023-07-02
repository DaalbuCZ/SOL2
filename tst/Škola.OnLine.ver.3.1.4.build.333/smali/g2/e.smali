.class abstract Lg2/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/e$a;
    }
.end annotation


# instance fields
.field protected final a:Lc2/e0;


# direct methods
.method protected constructor <init>(Lc2/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/e;->a:Lc2/e0;

    return-void
.end method


# virtual methods
.method public final a(Lu3/a0;J)Z
    .locals 1

    invoke-virtual {p0, p1}, Lg2/e;->b(Lu3/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lg2/e;->c(Lu3/a0;J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected abstract b(Lu3/a0;)Z
.end method

.method protected abstract c(Lu3/a0;J)Z
.end method
