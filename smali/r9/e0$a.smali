.class public final Lr9/e0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb9/g$c<",
        "Lr9/e0;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic n:Lr9/e0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/e0$a;

    invoke-direct {v0}, Lr9/e0$a;-><init>()V

    sput-object v0, Lr9/e0$a;->n:Lr9/e0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method