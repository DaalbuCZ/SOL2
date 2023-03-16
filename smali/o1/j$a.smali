.class final Lo1/j$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lo1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/j;

    invoke-direct {v0}, Lo1/j;-><init>()V

    sput-object v0, Lo1/j$a;->a:Lo1/j;

    return-void
.end method

.method static synthetic a()Lo1/j;
    .locals 1

    sget-object v0, Lo1/j$a;->a:Lo1/j;

    return-object v0
.end method
