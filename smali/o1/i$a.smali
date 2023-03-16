.class final Lo1/i$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lo1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/i;

    invoke-direct {v0}, Lo1/i;-><init>()V

    sput-object v0, Lo1/i$a;->a:Lo1/i;

    return-void
.end method

.method static synthetic a()Lo1/i;
    .locals 1

    sget-object v0, Lo1/i$a;->a:Lo1/i;

    return-object v0
.end method
