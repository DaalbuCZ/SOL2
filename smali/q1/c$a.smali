.class final Lq1/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lq1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq1/c;

    invoke-direct {v0}, Lq1/c;-><init>()V

    sput-object v0, Lq1/c$a;->a:Lq1/c;

    return-void
.end method

.method static synthetic a()Lq1/c;
    .locals 1

    sget-object v0, Lq1/c$a;->a:Lq1/c;

    return-object v0
.end method
