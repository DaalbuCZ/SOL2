.class final Lv4/c;
.super Lc4/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc4/a$a<",
        "Lw4/a;",
        "Lv4/d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Le4/d;Ljava/lang/Object;Lc4/f$a;Lc4/f$b;)Lc4/a$f;
    .locals 0

    check-cast p4, Lv4/d;

    sget p1, Lw4/a;->Z:I

    const/4 p1, 0x0

    throw p1
.end method
