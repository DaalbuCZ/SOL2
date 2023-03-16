.class final Lo1/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lo1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/g;

    invoke-direct {v0}, Lo1/g;-><init>()V

    sput-object v0, Lo1/g$a;->a:Lo1/g;

    return-void
.end method

.method static synthetic a()Lo1/g;
    .locals 1

    sget-object v0, Lo1/g$a;->a:Lo1/g;

    return-object v0
.end method
