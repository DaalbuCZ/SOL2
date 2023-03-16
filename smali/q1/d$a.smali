.class final Lq1/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lq1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq1/d;

    invoke-direct {v0}, Lq1/d;-><init>()V

    sput-object v0, Lq1/d$a;->a:Lq1/d;

    return-void
.end method

.method static synthetic a()Lq1/d;
    .locals 1

    sget-object v0, Lq1/d$a;->a:Lq1/d;

    return-object v0
.end method
