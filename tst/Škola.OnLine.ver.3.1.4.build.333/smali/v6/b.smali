.class public Lv6/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/b$b;
    }
.end annotation


# static fields
.field private static final a:Lv6/a;

.field private static volatile b:Lv6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv6/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv6/b$b;-><init>(Lv6/b$a;)V

    sput-object v0, Lv6/b;->a:Lv6/a;

    sput-object v0, Lv6/b;->b:Lv6/a;

    return-void
.end method

.method public static a()Lv6/a;
    .locals 1

    sget-object v0, Lv6/b;->b:Lv6/a;

    return-object v0
.end method
