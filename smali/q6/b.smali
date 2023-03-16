.class public Lq6/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq6/b$b;
    }
.end annotation


# static fields
.field private static final a:Lq6/a;

.field private static volatile b:Lq6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq6/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq6/b$b;-><init>(Lq6/b$a;)V

    sput-object v0, Lq6/b;->a:Lq6/a;

    sput-object v0, Lq6/b;->b:Lq6/a;

    return-void
.end method

.method public static a()Lq6/a;
    .locals 1

    sget-object v0, Lq6/b;->b:Lq6/a;

    return-object v0
.end method
