.class public final Lv9/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lj9/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/q<",
            "Lu9/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lv9/d$a;->w:Lv9/d$a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lk9/u;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj9/q;

    sput-object v0, Lv9/d;->a:Lj9/q;

    return-void
.end method

.method public static final synthetic a()Lj9/q;
    .locals 1

    sget-object v0, Lv9/d;->a:Lj9/q;

    return-object v0
.end method
