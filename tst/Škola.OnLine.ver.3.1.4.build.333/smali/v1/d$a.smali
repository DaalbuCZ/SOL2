.class final Lv1/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lv1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv1/d;

    invoke-direct {v0}, Lv1/d;-><init>()V

    sput-object v0, Lv1/d$a;->a:Lv1/d;

    return-void
.end method

.method static synthetic a()Lv1/d;
    .locals 1

    sget-object v0, Lv1/d$a;->a:Lv1/d;

    return-object v0
.end method
