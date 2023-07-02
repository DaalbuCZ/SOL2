.class public final Lz9/e0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz9/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj9/g$c<",
        "Lz9/e0;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic n:Lz9/e0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/e0$a;

    invoke-direct {v0}, Lz9/e0$a;-><init>()V

    sput-object v0, Lz9/e0$a;->n:Lz9/e0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
